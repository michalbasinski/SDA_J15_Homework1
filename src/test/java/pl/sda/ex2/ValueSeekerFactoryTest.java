package pl.sda.ex2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValueSeekerFactoryTest {

    @Test
    public void shouldReturnMinValueSeeker() {
        //given
        final ValueType valueType = ValueType.MIN;
        final ValueSeekerFactory factory = new ValueSeekerFactory();

        //when
        ValueSeeker result = factory.produce(valueType);

        //then
        assertTrue(result instanceof ValueSeeker);
        assertTrue(result instanceof MinValueSeeker);
        assertFalse(result instanceof MaxValueSeeker);
    }

    @Test
    public void shouldReturnMaxValueSeeker() {
        //given
        final ValueType valueType = ValueType.MAX;
        final ValueSeekerFactory factory = new ValueSeekerFactory();

        //when
        ValueSeeker result = factory.produce(valueType);

        //then
        assertTrue(result instanceof ValueSeeker);
        assertTrue(result instanceof MaxValueSeeker);
        assertFalse(result instanceof MinValueSeeker);
    }
}