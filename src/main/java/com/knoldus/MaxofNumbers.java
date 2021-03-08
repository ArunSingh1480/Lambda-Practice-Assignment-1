package com.knoldus;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxofNumbers implements Max {

    @Override
    public int maximum(int x, int y) {
         int maximumNumber= Stream.of(x, y)
                 .max(Comparator.comparing(Integer::valueOf))
                 .get();
         return  maximumNumber;
    }
}
