package com.BasicModel;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key,int[] a ){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid  = lo + (hi -lo) /2;
            if (key <a[mid]) hi = mid -1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static  void main(String[] args){
        int [] whitelist = In.readInts(args[0]); // 这里输入一个整型数据流，填入列表中
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            int key = StdInt.readInt();
            if (rank(key,whitelist)== -1){
                System.out.println(key);
            }
        }
    }
}
