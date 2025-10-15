package com.ramankaur.S4Lec55;

import java.util.Scanner;

public class try1 {
        public static void main(String[] args)
        {
            // Write your code here
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = scanner.nextInt();
                }
                int i,j;
                int shifts=0;
                for(i=0;i<arr.length;i++){
                    int key=arr[i];
                    j=i-1;

                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j--;
                        shifts++;
                    }
                    arr[j + 1] = key;
                    if (j + 1 != i) {
                        shifts++;
                    }
                }
                System.out.println(shifts);
            }

        }
}
