package pl.sda.ex1;

import java.time.LocalDate;

public class SummitBuilder {

    private Summit summit;

    public SummitBuilder() {
        summit = new Summit();
    }

    public SummitBuilder withName(String name) {
        summit.setName(name);
        return this;
    }

    public SummitBuilder withHeight(Integer height) {
        summit.setHeight(height);
        return this;
    }

    public SummitBuilder withFirstSummerAscent(LocalDate firstSummerAscent) {
        summit.setFirstSummerAscent(firstSummerAscent);
        return this;
    }

    public SummitBuilder withFirstWinterAscent(LocalDate firstWinterAscent) {
        summit.setFirstWinterAscent(firstWinterAscent);
        return this;
    }

    public SummitBuilder withLatitude(Latitude latitude) {
        summit.setLatitude(latitude);
        return this;
    }

    public SummitBuilder withLongitude(Longitude longitude) {
        summit.setLongitude(longitude);
        return this;
    }

    public Summit build() {
        return summit;
    }
}
