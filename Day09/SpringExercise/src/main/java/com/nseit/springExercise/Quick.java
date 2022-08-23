package com.nseit.springExercise;

import com.nseit.springExercise.SortAlg;
import org.springframework.stereotype.Component;

@Component
public class Quick implements SortAlg {

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
