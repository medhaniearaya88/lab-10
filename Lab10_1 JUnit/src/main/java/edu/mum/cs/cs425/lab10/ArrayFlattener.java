package edu.mum.cs.cs425.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(int[][] in){
        if(in == null){
            return null;
        }
        List<Integer> myList = new ArrayList<Integer>();
         for(int[] arr : in){
             for(int y : arr){
                 myList.add(y);
             }
         }
         return (Integer[])myList.toArray(new Integer[myList.size()]);
    }


    // with functional programing

    public int[] flattenArray2(int[][]in){
        if(in == null){
            return null;
        }
        return Arrays.stream(in).flatMapToInt(arr->Arrays.stream(arr)).toArray();
    }

}
