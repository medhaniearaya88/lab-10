package edu.mum.cs.cs425.lab10;

import edu.mum.cs.cs425.lab10.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }


    public int[] reversedArray(int [][] IN){
        int[] flag = arrayFlattenerService.flattenArray(IN);
        if(flag == null)
            return null;
        int i = 0;
        int j = flag.length - 1;
        while(i < j) {
            int temp = flag[i];
            flag[i] = flag[j];
            flag[j] = temp;
            i++;
            j--;
        }
        return flag;
    }
}
