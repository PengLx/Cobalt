package com.github.auties00.cobalt.model.jid;

import com.github.auties00.cobalt.client.WhatsAppClientType;
import com.github.auties00.cobalt.model.auth.UserAgent.PlatformType;
import com.github.auties00.cobalt.model.auth.Version;
import it.auties.protobuf.annotation.ProtobufMessage;
import it.auties.protobuf.annotation.ProtobufProperty;
import it.auties.protobuf.model.ProtobufType;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

@ProtobufMessage
public final class JidCompanion {
    private static final List<JidCompanion> IOS_DEVICES = List.of(
            // --- iPhone 7 --- (Supports iOS 10-15)
            new JidCompanion(
                    "iPhone 7",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone9,3",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 7",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone9,3",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone 7 Plus --- (Supports iOS 10-15)
            new JidCompanion(
                    "iPhone 7 Plus",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone9,4",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 7 Plus",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone9,4",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone 8 --- (Supports iOS 11-16)
            new JidCompanion(
                    "iPhone 8",
                    "Apple",
                    null,
                    Version.of("13.7"),
                    "17H35",
                    "iPhone10,4",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 8",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone10,4",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 8",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone10,4",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 8",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone10,4",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone 8 Plus --- (Supports iOS 11-16)
            new JidCompanion(
                    "iPhone 8 Plus",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone10,5",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 8 Plus",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone10,5",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone 8 Plus",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone10,5",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone X --- (Supports iOS 11-16)
            new JidCompanion(
                    "iPhone X",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone10,6",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone X",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone10,6",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone X",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone10,6",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone XR --- (Supports iOS 12-17)
            new JidCompanion(
                    "iPhone XR",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone11,8",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XR",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone11,8",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XR",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone11,8",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XR",
                    "Apple",
                    null,
                    Version.of("17.4.1"),
                    "21E236",
                    "iPhone11,8",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone XS --- (Supports iOS 12-17)
            new JidCompanion(
                    "iPhone XS",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone11,2",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone11,2",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone11,2",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS",
                    "Apple",
                    null,
                    Version.of("17.4.1"),
                    "21E236",
                    "iPhone11,2",
                    WhatsAppClientType.MOBILE
            ),

            // --- iPhone XS Max --- (Supports iOS 12-17)
            new JidCompanion(
                    "iPhone XS Max",
                    "Apple",
                    null,
                    Version.of("14.8.1"),
                    "18H107",
                    "iPhone11,6",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS Max",
                    "Apple",
                    null,
                    Version.of("15.8.2"),
                    "19H384",
                    "iPhone11,6",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS Max",
                    "Apple",
                    null,
                    Version.of("16.7.7"),
                    "20H330",
                    "iPhone11,6",
                    WhatsAppClientType.MOBILE
            ),
            new JidCompanion(
                    "iPhone XS Max",
                    "Apple",
                    null,
                    Version.of("17.4.1"),
                    "21E236",
                    "iPhone11,6",
                    WhatsAppClientType.MOBILE
            )
    );

    @ProtobufProperty(index = 1, type = ProtobufType.STRING)
    final String model;

    @ProtobufProperty(index = 2, type = ProtobufType.STRING)
    final String manufacturer;

    @ProtobufProperty(index = 3, type = ProtobufType.ENUM)
    final PlatformType platform;

    @ProtobufProperty(index = 4, type = ProtobufType.MESSAGE)
    final Version osVersion;

    @ProtobufProperty(index = 5, type = ProtobufType.STRING)
    final String osBuildNumber;

    @ProtobufProperty(index = 6, type = ProtobufType.STRING)
    final String modelId;

    @ProtobufProperty(index = 7, type = ProtobufType.ENUM)
    final WhatsAppClientType clientType;

    JidCompanion(
            String model,
            String manufacturer,
            PlatformType platform,
            Version osVersion,
            String osBuildNumber,
            String modelId,
            WhatsAppClientType clientType
    ) {
        this.model = model;
        this.modelId = modelId;
        this.manufacturer = manufacturer;
        this.platform = platform;
        this.osVersion = osVersion;
        this.osBuildNumber = osBuildNumber;
        this.clientType = clientType;
    }

    public static JidCompanion web() {
        return new JidCompanion(
                "Surface Pro 4",
                "Microsoft",
                PlatformType.MACOS,
                Version.of("10.0"),
                null,
                null,
                WhatsAppClientType.WEB
        );
    }

    public static JidCompanion ios(boolean business) {
        var device = IOS_DEVICES.get(ThreadLocalRandom.current().nextInt(IOS_DEVICES.size()));
        return new JidCompanion(
                device.model,
                device.manufacturer,
                business ? PlatformType.IOS_BUSINESS : PlatformType.IOS,
                device.osVersion,
                device.osBuildNumber,
                device.modelId,
                WhatsAppClientType.MOBILE
        );
    }

    // Realistic Android device profiles: model, manufacturer, modelId, osVersion, buildNumber, ramGb
    private record AndroidDevice(String model, String manufacturer, String modelId,
                                 String osVersion, String buildNumber, double ramGb) {}

    private static final List<AndroidDevice> ANDROID_DEVICES = List.of(
            // Samsung Galaxy S series
            new AndroidDevice("SM-S928B", "samsung", "SM-S928B", "14", "UP1A.231005.007", 12.0),
            new AndroidDevice("SM-S926B", "samsung", "SM-S926B", "14", "UP1A.231005.007", 12.0),
            new AndroidDevice("SM-S921B", "samsung", "SM-S921B", "14", "UP1A.231005.007", 8.0),
            new AndroidDevice("SM-S918B", "samsung", "SM-S918B", "14", "UP1A.231005.007", 12.0),
            new AndroidDevice("SM-S916B", "samsung", "SM-S916B", "14", "UP1A.231005.007", 8.0),
            new AndroidDevice("SM-S911B", "samsung", "SM-S911B", "14", "UP1A.231005.007", 8.0),
            new AndroidDevice("SM-S908B", "samsung", "SM-S908B", "13", "TP1A.220624.014", 12.0),
            new AndroidDevice("SM-S906B", "samsung", "SM-S906B", "13", "TP1A.220624.014", 8.0),
            new AndroidDevice("SM-S901B", "samsung", "SM-S901B", "13", "TP1A.220624.014", 8.0),
            // Samsung Galaxy A series (very popular worldwide)
            new AndroidDevice("SM-A546B", "samsung", "SM-A546B", "14", "UP1A.231005.007", 6.0),
            new AndroidDevice("SM-A346B", "samsung", "SM-A346B", "14", "UP1A.231005.007", 6.0),
            new AndroidDevice("SM-A155F", "samsung", "SM-A155F", "14", "UP1A.231005.007", 4.0),
            new AndroidDevice("SM-A256B", "samsung", "SM-A256B", "14", "UP1A.231005.007", 6.0),
            new AndroidDevice("SM-A536B", "samsung", "SM-A536B", "13", "TP1A.220624.014", 6.0),
            // Google Pixel
            new AndroidDevice("Pixel 8 Pro", "Google", "husky", "14", "UD1A.231105.004", 12.0),
            new AndroidDevice("Pixel 8", "Google", "shiba", "14", "UD1A.231105.004", 8.0),
            new AndroidDevice("Pixel 7 Pro", "Google", "cheetah", "14", "UD1A.231105.004", 12.0),
            new AndroidDevice("Pixel 7", "Google", "panther", "14", "UD1A.231105.004", 8.0),
            new AndroidDevice("Pixel 7a", "Google", "lynx", "14", "UD1A.231105.004", 8.0),
            new AndroidDevice("Pixel 6a", "Google", "bluejay", "14", "UD1A.231105.004", 6.0),
            new AndroidDevice("Pixel 6 Pro", "Google", "raven", "13", "TQ3A.230901.001", 12.0),
            // Xiaomi (huge market in Asia/Africa)
            new AndroidDevice("2201117TG", "Xiaomi", "2201117TG", "13", "TKQ1.221114.001", 8.0),   // Xiaomi 12
            new AndroidDevice("23049RAD8C", "Xiaomi", "23049RAD8C", "14", "UKQ1.231003.002", 8.0),  // Xiaomi 14
            new AndroidDevice("2203121C", "Xiaomi", "2203121C", "13", "TKQ1.221114.001", 6.0),      // Redmi Note 11
            new AndroidDevice("23076RN4BI", "Xiaomi", "23076RN4BI", "13", "TKQ1.221114.001", 8.0),  // Redmi Note 12 Pro
            new AndroidDevice("23106RN0DA", "Xiaomi", "23106RN0DA", "14", "UKQ1.231003.002", 8.0),  // Redmi Note 13 Pro
            // OPPO
            new AndroidDevice("CPH2581", "OPPO", "CPH2581", "14", "UKQ1.231003.002", 8.0),   // OPPO Find X7
            new AndroidDevice("CPH2495", "OPPO", "CPH2495", "13", "TP1A.220905.001", 8.0),   // OPPO Reno10
            new AndroidDevice("CPH2389", "OPPO", "CPH2389", "13", "TP1A.220905.001", 6.0),   // OPPO A78
            // Vivo
            new AndroidDevice("V2324", "vivo", "V2324", "14", "UP1A.231005.007", 12.0),  // vivo X100 Pro
            new AndroidDevice("V2254", "vivo", "V2254", "13", "TP1A.220624.014", 8.0),   // vivo V29
            // OnePlus
            new AndroidDevice("CPH2583", "OnePlus", "CPH2583", "14", "UKQ1.231003.002", 16.0),  // OnePlus 12
            new AndroidDevice("CPH2449", "OnePlus", "CPH2449", "14", "UKQ1.231003.002", 12.0),  // OnePlus 11
            // Huawei (still used in many markets)
            new AndroidDevice("NOH-NX9", "HUAWEI", "NOH-NX9", "12", "HUAWEINOH-NX9", 8.0),  // Mate 40 Pro
            new AndroidDevice("OCE-AN10", "HUAWEI", "OCE-AN10", "12", "HUAWEIOCE-AN10", 8.0) // Mate 40E
    );

    public static JidCompanion android(boolean business) {
        var device = ANDROID_DEVICES.get(ThreadLocalRandom.current().nextInt(ANDROID_DEVICES.size()));
        return new JidCompanion(
                device.model,
                device.manufacturer,
                business ? PlatformType.ANDROID_BUSINESS : PlatformType.ANDROID,
                Version.of(device.osVersion),
                device.buildNumber,
                device.modelId,
                WhatsAppClientType.MOBILE
        );
    }

    /**
     * Get a realistic RAM value in GB for the current device.
     * Returns the RAM from the matched AndroidDevice profile, or a random realistic value.
     */
    public double getDeviceRam() {
        for (var device : ANDROID_DEVICES) {
            if (device.model.equals(this.model) && device.manufacturer.equals(this.manufacturer)) {
                // Add slight variation to look natural (e.g., 8.0 -> 7.68 or 7.85)
                double base = device.ramGb;
                double variation = base * (0.93 + ThreadLocalRandom.current().nextDouble() * 0.05);
                return Math.round(variation * 100.0) / 100.0;
            }
        }
        // Fallback: common RAM values with slight variation
        double[] commonRam = {4.0, 6.0, 8.0, 8.0, 8.0, 12.0};
        double base = commonRam[ThreadLocalRandom.current().nextInt(commonRam.length)];
        double variation = base * (0.93 + ThreadLocalRandom.current().nextDouble() * 0.05);
        return Math.round(variation * 100.0) / 100.0;
    }

    public String osBuildNumber() {
        return Objects.requireNonNullElse(osBuildNumber, osVersion.toString());
    }

    public String toUserAgent(Version clientVersion) {
        if(platform == PlatformType.WINDOWS || platform == PlatformType.MACOS) {
            return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36";
        }else {
            var platformName = switch (platform) {
                case ANDROID -> "Android";
                case ANDROID_BUSINESS -> "SMBA";
                case IOS -> "iOS";
                case IOS_BUSINESS -> "SMB iOS";
                case MACOS, WINDOWS -> throw new InternalError();
            };
            var deviceName = switch (platform()) {
                case ANDROID, ANDROID_BUSINESS -> manufacturer + "-" + model;
                case IOS, IOS_BUSINESS -> model;
                case MACOS, WINDOWS -> throw new InternalError();
            };
            var deviceVersion = osVersion.toString();
            return "WhatsApp/%s %s/%s Device/%s".formatted(
                    clientVersion,
                    platformName,
                    deviceVersion,
                    deviceName
            );
        }
    }

    public JidCompanion toPersonal() {
        if (!platform.isBusiness()) {
            return this;
        }

        return withPlatform(platform.toPersonal());
    }

    public JidCompanion toBusiness() {
        if (platform.isBusiness()) {
            return this;
        }

        return withPlatform(platform.toBusiness());
    }

    public JidCompanion withPlatform(PlatformType platform) {
        return new JidCompanion(
                model,
                manufacturer,
                Objects.requireNonNullElse(platform, this.platform),
                osVersion,
                osBuildNumber,
                modelId,
                clientType
        );
    }

    public String model() {
        return model;
    }

    public String modelId() {
        return modelId;
    }

    public String manufacturer() {
        return manufacturer;
    }

    public PlatformType platform() {
        return platform;
    }

    public Version osVersion() {
        return osVersion;
    }

    public WhatsAppClientType clientType() {
        return clientType;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof JidCompanion that
                && Objects.equals(model, that.model)
                && Objects.equals(manufacturer, that.manufacturer)
                && platform == that.platform
                && Objects.equals(osVersion, that.osVersion)
                && Objects.equals(osBuildNumber, that.osBuildNumber)
                && Objects.equals(modelId, that.modelId)
                && clientType == that.clientType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, platform, osVersion, osBuildNumber, modelId, clientType);
    }

    @Override
    public String toString() {
        return "JidCompanion[" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", platform=" + platform +
                ", osVersion=" + osVersion +
                ", osBuildNumber='" + osBuildNumber + '\'' +
                ", modelId='" + modelId + '\'' +
                ", clientType=" + clientType +
                ']';
    }
}
