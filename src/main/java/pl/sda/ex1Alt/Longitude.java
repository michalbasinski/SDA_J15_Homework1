package pl.sda.ex1Alt;

import java.util.Objects;

class Longitude {
    private Integer degree;
    private Integer minutes;
    private Integer seconds;

    Longitude(Integer degree, Integer minutes, Integer seconds) {
        this.degree = degree;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Integer getDegree() {
        return degree;
    }

    void setDegree(Integer degree) {
        this.degree = degree;
    }

    Integer getMinutes() {
        return minutes;
    }

    void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    Integer getSeconds() {
        return seconds;
    }

    void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Longitude longitude = (Longitude) o;
        return Objects.equals(degree, longitude.degree) &&
                Objects.equals(minutes, longitude.minutes) &&
                Objects.equals(seconds, longitude.seconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree, minutes, seconds);
    }
}
