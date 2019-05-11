package pl.sda.ex1Alt;

import java.time.LocalDate;

class Summit {
    private String name;
    private Integer height;
    private Longitude longitude;
    private Latitude latitude;
    private LocalDate firstSummerAscent;
    private LocalDate firstWinterAscent;

    Summit(String name, Integer height, Longitude longitude, Latitude latitude, LocalDate firstSummerAscent, LocalDate firstWinterAscent) {
        this.name = name;
        this.height = height;
        this.longitude = longitude;
        this.latitude = latitude;
        this.firstSummerAscent = firstSummerAscent;
        this.firstWinterAscent = firstWinterAscent;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getHeight() {
        return height;
    }

    void setHeight(Integer height) {
        this.height = height;
    }

    Longitude getLongitude() {
        return longitude;
    }

    void setLongitude(Longitude longitude) {
        this.longitude = longitude;
    }

    Latitude getLatitude() {
        return latitude;
    }

    void setLatitude(Latitude latitude) {
        this.latitude = latitude;
    }

    LocalDate getFirstSummerAscent() {
        return firstSummerAscent;
    }

    void setFirstSummerAscent(LocalDate firstSummerAscent) {
        this.firstSummerAscent = firstSummerAscent;
    }

    LocalDate getFirstWinterAscent() {
        return firstWinterAscent;
    }

    void setFirstWinterAscent(LocalDate firstWinterAscent) {
        this.firstWinterAscent = firstWinterAscent;
    }
}
