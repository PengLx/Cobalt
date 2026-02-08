package com.github.auties00.cobalt.client.registration;

import com.github.auties00.cobalt.client.WhatsAppClientVerificationHandler;
import com.github.auties00.cobalt.store.WhatsAppStore;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class WhatsAppAndroidClientRegistration extends WhatsAppMobileClientRegistration {
    public WhatsAppAndroidClientRegistration(WhatsAppStore store, WhatsAppClientVerificationHandler.Mobile verification) {
        super(store, verification);
    }

    @Override
    protected HttpRequest createRequest(String path, String body) {
        return HttpRequest.newBuilder()
                .uri(URI.create("%s%s".formatted(MOBILE_REGISTRATION_ENDPOINT, path)))
                .POST(HttpRequest.BodyPublishers.ofString("ENC=" + body))
                .header("User-Agent", store.device().toUserAgent(store.clientVersion()))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "text/json")
                .header("WaMsysRequest", "1")
                .header("request_token", UUID.randomUUID().toString())
                .build();
    }

    @Override
    protected String[] getRequestVerificationCodeParameters(String method) {
        // Derive realistic MCC/MNC from the phone number's country
        var phoneNumber = getPhoneNumber(store);
        var mccMnc = MccMncDatabase.getForCountryCode(phoneNumber.getCountryCode());

        // Realistic device RAM from device profile
        var deviceRam = String.format(Locale.US, "%.2f", store.device().getDeviceRam());

        // Android signal strength: 0-4, 2-3 is typical
        var cellStrength = String.valueOf(ThreadLocalRandom.current().nextInt(2, 5));

        // Low attempt count: 1-3 is normal for a fresh registration
        var attempts = String.valueOf(ThreadLocalRandom.current().nextInt(1, 4));

        // Android PID range: 5000-32000 is typical for user apps
        var pid = String.valueOf(ThreadLocalRandom.current().nextInt(5000, 32000));

        return new String[]{
                "method", method,
                "sim_mcc", mccMnc.mcc(),
                "sim_mnc", mccMnc.mnc(),
                "reason", "",
                "mcc", mccMnc.mcc(),
                "mnc", mccMnc.mnc(),
                "feo2_query_status", "success",
                "db", "1",
                "sim_type", "1",
                "recaptcha", "%7B%22stage%22%3A%22ABPROP_ENABLED%22%7D",
                "network_radio_type", "1",
                "prefer_sms_over_flash", "false",
                "simnum", "1",
                "airplane_mode_type", "0",
                "client_metrics", "%7B%22attempts%22%3A" + attempts + "%2C%22app_campaign_download_source%22%3A%22google-play%7Cunknown%22%7D",
                "mistyped", "6",
                "advertising_id", store.advertisingId().toString(),
                "hasinrc", "1",
                "roaming_type", "0",
                "device_ram", deviceRam,
                "education_screen_displayed", "true",
                "pid", pid,
                "gpia", "",
                "cellular_strength", cellStrength,
                "_gg", "",
                "_gi", "",
                "_gp", "",
                "backup_token", toUrlHex(store.backupToken()),
                "hasav", "2"
        };
    }

    @Override
    protected String generateFdid() {
        return store.fdid().toString().toLowerCase(Locale.ROOT);
    }
}
