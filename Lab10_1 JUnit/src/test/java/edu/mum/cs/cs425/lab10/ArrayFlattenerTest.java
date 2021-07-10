package edu.mum.cs.cs425.lab10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener = null;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    // Test iterative Method
    @Test
    public void flattenArray() {
        int [][] a_in = {{1,3},{0},{4,5,9}};
        Integer [] a_out = arrayFlattener.flattenArray(a_in);
        Integer [] expected_output = {1,3,0,4,5,9};
        boolean areArraysEqual = Arrays.equals(expected_output,a_out);
        assertTrue(areArraysEqual);
    }

    // Test functional programing  Method
    @Test
    public void flattenArray2() {
        int [][] a_in = {{1,3},{0},{4,5,9}};
        int[] a_out = arrayFlattener.flattenArray2(a_in);
        int [] expected_result = {1,3,0,4,5,9};
        boolean areEqual = Arrays.equals(expected_result,a_out);
        assertTrue(areEqual);
    }
}