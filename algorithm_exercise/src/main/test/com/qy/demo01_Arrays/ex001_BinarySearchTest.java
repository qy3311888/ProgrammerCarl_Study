package com.qy.demo01_Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex001_BinarySearchTest {

    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5};
        int target = 4;
        ex001_BinarySearch res = new ex001_BinarySearch();
        Assertions.assertEquals(3, res.ex1(nums, target));
        System.out.println(res.ex1(nums, target));
    }

}