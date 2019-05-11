package pl.sda.ex1;

class LongitudeBuilder {

    private Longitude longitude;

    LongitudeBuilder() {
        longitude = new Longitude();
    }

    LongitudeBuilder withDegrees(Integer degrees) {
        longitude.setDegree(degrees);
        return this;
    }

    LongitudeBuilder withMinutes(Integer minutes) {
        longitude.setMinutes(minutes);
        return this;
    }

    LongitudeBuilder withSeconds(Integer seconds) {
        longitude.setSeconds(seconds);
        return this;
    }

    Longitude build() {
        return longitude;
    }
}
