package com.ohgiraffers.test;

public class Application10 {

    public static void main(String[] args) {

        Application10 app10 = new Application10();
        System.out.println(app10.method1());

        app10.method2();

    }

    public String method1(){

        return "난 정곤";

    }

    public void method2(){

        int num1=10;
        int num2=20;

        System.out.println("내 동생 나이는" + num1 + "이고, 내 나이는 " + num2 + "이얍");
    }

}
