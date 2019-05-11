package pl.sda.ex2Alt;

import java.util.Arrays;
import java.util.List;

class App {
    public static void main(String[] args) {
        ValueSeekerFactory factory = new ValueSeekerFactory();
        ValueSeeker seeker = factory.produce(ValueType.MIN);

        List<Integer> elements =
                Arrays.asList(43,6546,24235,765756,2423427,654547,32423423,75756,654654,432423,765765);

        System.out.println(seeker.find(elements));

    }
}
