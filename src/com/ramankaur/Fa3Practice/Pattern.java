package com.ramankaur.Fa3Practice;

public class Pattern {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        /// / right triangle
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /// // pyramid
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=2*i-1;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        /// / floyds triangle
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }System.out.println();
//
//        }


        /////hollow square
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1||j==1||i==n|j==n)System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }


        /// /////inverted right triangle
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=n;j++){
//                System.out.print("*");
//            }System.out.println();
//        }


        /// //// diamond pattern
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int k=1;k<=n-i;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //number pattern
//        for (int i = 1; i <= 5; i++) {
//            // Inner loop for the numbers in each row
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            // Move to the next line after each row
//            System.out.println();
//        }


        ///   //////// Pasccal triangle
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            int num = 1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + " ");
//                num = num * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }


        /////// sandglass pattern
//        int n = 5;
//// Upper half
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++) System.out.print(" ");
//            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
//            System.out.println();
//        }
//// Lower half
//        for (int i = 2; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) System.out.print(" ");
//            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
//            System.out.println();
//        }


        ///////// heart pattern
        System.out.println(" * * ");
        System.out.println("* *");
        System.out.println("* *");
// Bottom triangle
        for (int i = 7; i >= 1; i -= 2) {
            for (int j = 0; j < (7 - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
