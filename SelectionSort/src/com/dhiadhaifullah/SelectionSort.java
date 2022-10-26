package com.dhiadhaifullah;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,10,11,3,7,6};
        int n = arr.length;
        System.out.println();
        // System.out.println("Before selection sort --> ");
        // for(int i =0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }


        for (int i = 0; i < n; i++) {
            int max=arr[0];
            int index=0;
            for (int j=0; j<n-i; j++) {
                if (arr[j] > max) {
                    max=arr[j];
                    index=j;
                    // System.out.println("Ini tanda pertukaran data pada index ke- " + arr[j]);
                    // System.out.println();
                    // System.out.println("ini nilai max" + max);
                }
            }
            arr[index]=arr[arr.length-(i+1)];
            // System.out.println("Sekarang perulangan nilai ke-" + arr[index]);
            arr[arr.length-(i+1)]=max;
            // System.out.println("Sekarang angka " + arr[index] + " berada pda index " + index );
            System.out.println();
            // System.out.println("Sekarang angka " + max + " berada pda index " + index );
            // System.out.print(arr[arr.length-(i+1)]);
        }

        System.out.println(" ");
        System.out.println("After selection sort --> ");
        for (int x = 0; x < n; x++ ) {
            System.out.print(arr[x] + " ");
        }System.out.println();
    }  
}

