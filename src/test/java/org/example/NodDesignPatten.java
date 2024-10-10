package org.example;

public class NodDesignPatten {
    public void Test1(){
        System.out.println("Test1");
    }
    public void Test2(){
        System.out.println("Test2");
    }
    public void Test3(String sample){
        System.out.println("Test3");
    }

    public static void main(String[] args) {
        NodDesignPatten n= new NodDesignPatten();
        n.Test1();
        n.Test2();
        n.Test3("Dani");
    }
}
