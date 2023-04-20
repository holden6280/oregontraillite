package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String[] args){

        Traveler holden = new Traveler("Holden",100,100);

        System.out.println("Food: " + holden.getFood());
        System.out.println(holden.hunt());
        System.out.println("Food: " + holden.getFood());
        System.out.println(holden.eat());
        System.out.println(holden.eat());
        System.out.println(holden.eat());
        System.out.println(holden.eat());
        System.out.println(holden.eat());
        System.out.println(holden.eat());
        System.out.println("Food: " + holden.getFood());

    }

}
