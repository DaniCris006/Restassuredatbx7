package org.example;

import scala.concurrent.impl.FutureConvertersImpl;

public class ProperDesignPatten {
    public  ProperDesignPatten Test1(){
        System.out.println("Test 1 Done");
    return this;
    }
    public  ProperDesignPatten Test2(){
        System.out.println("Test 2 Done");
        return this;
    }
    public  ProperDesignPatten Test3(String data){
        System.out.println("Test 3 Done");
        return this;
    }

    public static void main(String[] args) {
        ProperDesignPatten P= new ProperDesignPatten();
        P.Test1().Test3("Dani").Test2().Test1();
        //Organise the test as per the flow
        //How the dot is working in Rest Assured

    }

}
