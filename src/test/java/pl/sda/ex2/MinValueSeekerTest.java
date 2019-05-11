package pl.sda.ex2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinValueSeekerTest {

    @Test
    public void shouldFindMinus20AsMinElement() {
        //given
        final Integer expectedMin = -20;
        final List<Integer> elements = Arrays.asList(5, -10, -20, 11, 0, -1, 15);
        final ValueSeeker seeker = new MinValueSeeker();

        //when
        Integer result = seeker.find(elements);

        //then
        assertEquals(expectedMin, result);
    }

    @Test(expected = EmptyListException.class)
    public void shouldThrowExceptionWhenListIsEmpty() {
        //given
        final List<Integer> elements = new ArrayList<>();
        final ValueSeeker seeker = new MinValueSeeker();

        //when
        seeker.find(elements);
    }

    @Test(expected = EmptyListException.class)
    public void shouldThrowExceptionWhenListIsNull() {
        //given
        final List<Integer> elements = null;
        final ValueSeeker seeker = new MinValueSeeker();

        //when
        seeker.find(elements);
    }
}