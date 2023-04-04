package com.skwaweru254;

public class OpInstanceof {


    public static void main(String[] args) {

        // variable of string type
        String name = "skwaweru254";

        // checks if name is instance of String
        boolean r1 = name instanceof String;
        System.out.println("Variable name is an instance of String: " + r1 + "\n");

        // create an object of Main class
        OpInstanceof obj = new OpInstanceof();

        // checks if obj is an instance of Main class
        boolean r2 = obj instanceof OpInstanceof;
        System.out.println("Object obj is an instance of OpInstanceof: " + r2 + "\n");
        //Instantiate a class GirlFriend to Mary
        GirlFriend Mary = new GirlFriend();
        //upcasting a subclass to superclass
        Friend Mercy = new GirlFriend();
        //Calling loveBird method
        loveBird(Mary);
        sideChick(Mercy);

        //Instantiate a class boyfriend to Maina
        BoyFriend John = new BoyFriend();
        //Calling greatMinds method
        greatMinds(John);



    }

    public static void loveBird(GirlFriend gf) {

        gf.sayHi();
        gf.kiss();
        gf.fuck();
    }
    public static void sideChick(Friend bg) {

        bg.kiss();
    }
    public static void greatMinds(BoyFriend bf){

        //Downcasting friend to boyfriend
        ((BoyFriend) bf).loans();
    }


}
