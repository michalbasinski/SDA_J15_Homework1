package pl.sda.ex2Alt;

import java.util.List;

@FunctionalInterface
interface ValueSeeker {
    Integer find(List<Integer> values);
}
