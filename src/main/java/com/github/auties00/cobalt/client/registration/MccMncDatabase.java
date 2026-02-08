package com.github.auties00.cobalt.client.registration;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Maps country calling codes to realistic MCC/MNC pairs.
 * Used to generate believable SIM card information during registration.
 */
public final class MccMncDatabase {
    public record MccMnc(String mcc, String mnc) {}

    // Country calling code -> list of real carrier MCC/MNC pairs
    private static final Map<Integer, List<MccMnc>> DATABASE = Map.ofEntries(
            // United States (+1)
            Map.entry(1, List.of(
                    new MccMnc("310", "260"), // T-Mobile
                    new MccMnc("311", "480"), // Verizon
                    new MccMnc("310", "410"), // AT&T
                    new MccMnc("310", "120")  // Sprint
            )),
            // Russia (+7)
            Map.entry(7, List.of(
                    new MccMnc("250", "01"),  // MTS
                    new MccMnc("250", "02"),  // MegaFon
                    new MccMnc("250", "99")   // Beeline
            )),
            // Egypt (+20)
            Map.entry(20, List.of(
                    new MccMnc("602", "01"),  // Mobinil
                    new MccMnc("602", "02"),  // Vodafone
                    new MccMnc("602", "03")   // Etisalat
            )),
            // South Africa (+27)
            Map.entry(27, List.of(
                    new MccMnc("655", "01"),  // Vodacom
                    new MccMnc("655", "10"),  // MTN
                    new MccMnc("655", "07")   // Cell C
            )),
            // India (+91)
            Map.entry(91, List.of(
                    new MccMnc("404", "10"),  // AirTel
                    new MccMnc("404", "86"),  // Vodafone
                    new MccMnc("405", "854"), // Jio
                    new MccMnc("404", "45")   // BSNL
            )),
            // UK (+44)
            Map.entry(44, List.of(
                    new MccMnc("234", "10"),  // O2
                    new MccMnc("234", "15"),  // Vodafone
                    new MccMnc("234", "30"),  // EE
                    new MccMnc("234", "20")   // Three
            )),
            // Germany (+49)
            Map.entry(49, List.of(
                    new MccMnc("262", "01"),  // Telekom
                    new MccMnc("262", "02"),  // Vodafone
                    new MccMnc("262", "03")   // O2
            )),
            // France (+33)
            Map.entry(33, List.of(
                    new MccMnc("208", "01"),  // Orange
                    new MccMnc("208", "10"),  // SFR
                    new MccMnc("208", "20")   // Bouygues
            )),
            // Brazil (+55)
            Map.entry(55, List.of(
                    new MccMnc("724", "10"),  // Vivo
                    new MccMnc("724", "11"),  // Claro
                    new MccMnc("724", "02")   // TIM
            )),
            // China (+86)
            Map.entry(86, List.of(
                    new MccMnc("460", "00"),  // China Mobile
                    new MccMnc("460", "01"),  // China Unicom
                    new MccMnc("460", "11")   // China Telecom
            )),
            // Japan (+81)
            Map.entry(81, List.of(
                    new MccMnc("440", "10"),  // NTT docomo
                    new MccMnc("440", "20"),  // SoftBank
                    new MccMnc("440", "51")   // KDDI
            )),
            // Indonesia (+62)
            Map.entry(62, List.of(
                    new MccMnc("510", "10"),  // Telkomsel
                    new MccMnc("510", "11"),  // XL
                    new MccMnc("510", "01")   // Indosat
            )),
            // Turkey (+90)
            Map.entry(90, List.of(
                    new MccMnc("286", "01"),  // Turkcell
                    new MccMnc("286", "02"),  // Vodafone
                    new MccMnc("286", "03")   // Turk Telekom
            )),
            // Mexico (+52)
            Map.entry(52, List.of(
                    new MccMnc("334", "020"), // Telcel
                    new MccMnc("334", "050"), // AT&T
                    new MccMnc("334", "030")  // Movistar
            )),
            // Thailand (+66)
            Map.entry(66, List.of(
                    new MccMnc("520", "01"),  // AIS
                    new MccMnc("520", "04"),  // TrueMove H
                    new MccMnc("520", "18")   // DTAC
            )),
            // Philippines (+63)
            Map.entry(63, List.of(
                    new MccMnc("515", "02"),  // Globe
                    new MccMnc("515", "03"),  // Smart
                    new MccMnc("515", "05")   // Sun
            )),
            // Vietnam (+84)
            Map.entry(84, List.of(
                    new MccMnc("452", "01"),  // Mobifone
                    new MccMnc("452", "02"),  // Vinaphone
                    new MccMnc("452", "04")   // Viettel
            )),
            // Cambodia (+855)
            Map.entry(855, List.of(
                    new MccMnc("456", "01"),  // Cellcard
                    new MccMnc("456", "02"),  // Smart
                    new MccMnc("456", "04"),  // qb
                    new MccMnc("456", "08"),  // Metfone
                    new MccMnc("456", "18")   // Cellcard
            )),
            // Nigeria (+234)
            Map.entry(234, List.of(
                    new MccMnc("621", "20"),  // Airtel
                    new MccMnc("621", "30"),  // MTN
                    new MccMnc("621", "50")   // Glo
            )),
            // Pakistan (+92)
            Map.entry(92, List.of(
                    new MccMnc("410", "01"),  // Mobilink
                    new MccMnc("410", "04"),  // Zong
                    new MccMnc("410", "06")   // Telenor
            )),
            // Bangladesh (+880)
            Map.entry(880, List.of(
                    new MccMnc("470", "01"),  // Grameenphone
                    new MccMnc("470", "02"),  // Robi
                    new MccMnc("470", "07")   // Banglalink
            )),
            // Malaysia (+60)
            Map.entry(60, List.of(
                    new MccMnc("502", "12"),  // Maxis
                    new MccMnc("502", "13"),  // Celcom
                    new MccMnc("502", "16")   // Digi
            )),
            // Saudi Arabia (+966)
            Map.entry(966, List.of(
                    new MccMnc("420", "01"),  // STC
                    new MccMnc("420", "03"),  // Mobily
                    new MccMnc("420", "04")   // Zain
            )),
            // UAE (+971)
            Map.entry(971, List.of(
                    new MccMnc("424", "02"),  // Etisalat
                    new MccMnc("424", "03")   // du
            )),
            // Argentina (+54)
            Map.entry(54, List.of(
                    new MccMnc("722", "310"), // Claro
                    new MccMnc("722", "070"), // Movistar
                    new MccMnc("722", "340")  // Personal
            )),
            // Colombia (+57)
            Map.entry(57, List.of(
                    new MccMnc("732", "101"), // Claro
                    new MccMnc("732", "123"), // Movistar
                    new MccMnc("732", "103")  // Tigo
            )),
            // Kenya (+254)
            Map.entry(254, List.of(
                    new MccMnc("639", "02"),  // Safaricom
                    new MccMnc("639", "03"),  // Airtel
                    new MccMnc("639", "07")   // Telkom
            )),
            // Italy (+39)
            Map.entry(39, List.of(
                    new MccMnc("222", "01"),  // TIM
                    new MccMnc("222", "10"),  // Vodafone
                    new MccMnc("222", "88")   // Wind Tre
            )),
            // Spain (+34)
            Map.entry(34, List.of(
                    new MccMnc("214", "01"),  // Vodafone
                    new MccMnc("214", "03"),  // Orange
                    new MccMnc("214", "07")   // Movistar
            )),
            // Poland (+48)
            Map.entry(48, List.of(
                    new MccMnc("260", "01"),  // Plus
                    new MccMnc("260", "02"),  // T-Mobile
                    new MccMnc("260", "06")   // Play
            )),
            // Myanmar (+95)
            Map.entry(95, List.of(
                    new MccMnc("414", "01"),  // MPT
                    new MccMnc("414", "05"),  // Ooredoo
                    new MccMnc("414", "06")   // Telenor
            )),
            // Ethiopia (+251)
            Map.entry(251, List.of(
                    new MccMnc("636", "01")   // Ethio Telecom
            )),
            // Tanzania (+255)
            Map.entry(255, List.of(
                    new MccMnc("640", "02"),  // tiGO
                    new MccMnc("640", "04"),  // Vodacom
                    new MccMnc("640", "05")   // Airtel
            ))
    );

    // Fallback: generate a plausible MCC from country calling code
    private static final MccMnc FALLBACK = new MccMnc("310", "260");

    /**
     * Get a random realistic MCC/MNC pair for the given country calling code.
     */
    public static MccMnc getForCountryCode(int countryCallingCode) {
        var carriers = DATABASE.get(countryCallingCode);
        if (carriers == null || carriers.isEmpty()) {
            return FALLBACK;
        }
        return carriers.get(ThreadLocalRandom.current().nextInt(carriers.size()));
    }
}
