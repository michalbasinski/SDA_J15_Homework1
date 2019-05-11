package pl.sda.ex1;

class LatitudeBuilder {

    private Latitude latitude;

    LatitudeBuilder() {
        latitude = new Latitude();
    }

    LatitudeBuilder withDegrees(Integer degrees) {
        latitude.setDegree(degrees);
        return this;
    }

    LatitudeBuilder withMinutes(Integer minutes) {
        latitude.setMinutes(minutes);
        return this;
    }

    LatitudeBuilder withSeconds(Integer seconds) {
        latitude.setSeconds(seconds);
        return this;
    }

    Latitude build() {
        return latitude;
    }

}
