package com.ramankaur.Fa3Practice;

public class arguments {
    public static void main(String[] args) {
        System.out.println("Hello World");
        if(args.length>0) {
            System.out.println ( "First argument: " + args[0] );
            System.out.println ( "Second argument: " + args[1] );
        }
        else{
            System.out.println("No argumrnt provided");
        }
}

}
