package com.unittest;

import java.util.Arrays;

public class ArrayTest {
    public int[] sortArray(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public long sumOf(int n){
        long sum = 0;
        for(long i = 0; i < 10_00_000; i++){
            sum += (long)n;
        }
        return sum;
    }
}
