package nl.han.aim.oose.dea;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        return input.stream()
                .filter(string -> string.length() < 3)
                .collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        return input.stream()
                .filter(string -> string.matches("[0-9]+"))
                .collect(Collectors.toList());
    }
}


