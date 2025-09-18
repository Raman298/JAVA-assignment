package com.ramankaur.S3lec43;

import java.util.Arrays;

public class CacheArray {
    public static void main(String[] args) {
        String[] cache= new String[5];
        int next=0;
        String[] pages={"P1","P2","P3","P4","P5","P6","P7"};
        for(String page:pages){
            cache[next]=page;
            next=(next+1)% cache.length;
            System.out.print("Cache: ");
            for(String c:cache){
                if(c!=null) System.out.print(c+" ");
            }
            System.out.println();
        }
//        Scanner sc=new Scanner(System.in);
//        int n;
//        n=sc.nextInt();
//        sc.nextLine();
//
//
//
//
//        for(int i=0;i< cache.length;i++){
//            cache[i]=sc.nextLine();
//        }
//        int next=0;
//        for(int i=0;i< cache.length;i++) {
//            cache[next] = "Page "+ (i+1);
//            System.out.println(cache[next]);
//            next = (next + 1) % cache.length;
//        }

        System.out.println( Arrays.toString(cache));


    }
}
