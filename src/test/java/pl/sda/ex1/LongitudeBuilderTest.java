package pl.sda.ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongitudeBuilderTest {
    @Test
    public void shouldCreateCorrectLongitudeObject() {
        //given
        final Integer expectedDegrees = 0;
        final Integer expectedMinutes = 0;
        final Integer expectedSeconds = 0;
        LongitudeBuilder builder = new LongitudeBuilder();

        //when
        Longitude result = builder.withDegrees(0)
                .withMinutes(0).withSeconds(0).build();

        //then
        assertEquals(expectedDegrees, result.getDegree());
        assertEquals(expectedMinutes, result.getMinutes());
        assertEquals(expectedSeconds, result.getSeconds());
    }
}