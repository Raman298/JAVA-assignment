package com.ramankaur.S4Lec55;

public class CountEven {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 8, 9, 5, 4, 5};
        int evenCount = 0;
        for (Integer num : number) {
            int value = Integer.valueOf(num);
            if (value % 2 == 0) {
                evenCount++;
            }

        }
        System.out.println(evenCount);
    }
}
