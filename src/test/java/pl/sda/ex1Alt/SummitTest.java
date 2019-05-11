package pl.sda.ex1Alt;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class SummitTest {

    @Test
    public void shouldCreateCorrectSummitObject() {
        //given
        final String expectedName = "Mt. Everest";
        final Integer expectedHeight = 8848;
        final LocalDate expectedFirstSummerAscent = LocalDate.of(1953, 5, 29);
        final LocalDate expectedFirstWinterAscent = LocalDate.of(1980, 2, 17);
        final Longitude expectedLongitude = new Longitude(86, 55, 31);
        final Latitude expectedLatitude = new Latitude(29, 59, 17);

        //when
        Summit result = new Summit("Mt. Everest", 8848,
                new Longitude(86, 55, 31),
                new Latitude(29, 59, 17),
                LocalDate.of(1953, 5, 29),
                LocalDate.of(1980, 2, 17));


        //then
        assertEquals(expectedName, result.getName());
        assertEquals(expectedHeight, result.getHeight());
        assertEquals(expectedFirstSummerAscent, result.getFirstSummerAscent());
        assertEquals(expectedFirstWinterAscent, result.getFirstWinterAscent());
        assertEquals(expectedLongitude, result.getLongitude());
        assertEquals(expectedLatitude, result.getLatitude());
    }

}