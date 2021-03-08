package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MaxofNumbersTest {
    MaxofNumbers obj =new MaxofNumbers();

    @Test
    void MaximumNumber() {
        int test1= obj.maximum(2,5);
        Assertions.assertEquals(5,test1);
    }

    @Test
    void NotMaximumNumbers(){
        int test2= obj.maximum(-6,1);
        Assertions.assertNotEquals(-6,test2);

    }
}