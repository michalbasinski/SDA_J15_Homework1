package pl.sda.ex1;

import java.time.LocalDate;

class SummitBuilder {

    private Summit summit;

    SummitBuilder() {
        summit = new Summit();
    }

    SummitBuilder withName(String name) {
        summit.setName(name);
        return this;
    }

    SummitBuilder withHeight(Integer height) {
        summit.setHeight(height);
        return this;
    }

    SummitBuilder withFirstSummerAscent(LocalDate firstSummerAscent) {
        summit.setFirstSummerAscent(firstSummerAscent);
        return this;
    }

    SummitBuilder withFirstWinterAscent(LocalDate firstWinterAscent) {
        summit.setFirstWinterAscent(firstWinterAscent);
        return this;
    }

    SummitBuilder withLatitude(Latitude latitude) {
        summit.setLatitude(latitude);
        return this;
    }

    SummitBuilder withLongitude(Longitude longitude) {
        summit.setLongitude(longitude);
        return this;
    }

    Summit build() {
        return summit;
    }
}
