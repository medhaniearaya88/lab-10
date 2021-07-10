package edu.mum.cs.cs425.lab10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFlattenerNullTest {
    private ArrayFlattener arrayFlattener = null;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void flattenArrayNull() {
        int [][] a_in = null;
        Integer[] a_out = arrayFlattener.flattenArray(a_in);
        Integer[] expected = null;
        boolean areThesame = Arrays.equals(expected,a_out);
        assertTrue(areThesame);

    }

    @Test
    public void flattenArrayNull2() {
        int [][] a_in = null;
        int[] a_out = arrayFlattener.flattenArray2(a_in);
        int[] expected = null;
        boolean areThesame = Arrays.equals(expected,a_out);
        assertTrue(areThesame);
    }
}