package com.nseit.springExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class SpringExerciseApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringExerciseApplication.class);
        BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearchImpl.binarySearch(new int[]{23, 45, 87, 65}, 23);
        System.out.println(result);
        System.out.println(binarySearchImpl);
    }

}
