package com.dhiadhaifullah;
public class TugasSelectionSort {
    public static void main(String[] args) {
        int[] a = {3,1,5,4,2};
        int n = a.length;


        for (int i = 0; i < 1; i++) {
            int max=a[0];
            int na=0;
            for (int j=0; j<2-i; j++) {
                if (a[j] >max) {
                    max=a[j];
                    na=j;
                }
            }
            //change the na
            a[na]=a[a.length-(i+1)];
            a[a.length-(i+1)]=max; //max value change the last element
            
        }
    
        // for (int i = n-1; i > 0; i++) {
        //     int max=i;
        //     for (int j = i + 1; j < n; j++) {
        //         if (index[max] < index[j]) {
        //             int tanda = index[max];
        //             index[max] = index[j];
        //             index[j] = tanda;
        //             // System.out.print(index[max]);
        //         }
        //     }
        //     max = i;
        // }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
