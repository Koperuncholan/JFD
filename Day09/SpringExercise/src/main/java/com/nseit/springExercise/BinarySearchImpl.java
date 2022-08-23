package com.nseit.springExercise;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private Bubble sortAlg;
    public int binarySearch(int [] numbers,int numToFind) {
        int [] sortedNumber = sortAlg.sort(numbers);
        System.out.println(sortAlg);

        return 10;
    }
}
