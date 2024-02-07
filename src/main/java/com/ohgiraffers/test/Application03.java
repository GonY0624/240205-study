package com.ohgiraffers.test;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용해보자.  */
        Application03 app03 = new Application03();
//        app03.plusMethod(26,32);
        System.out.println("두 수를 더한 값은 = " + app03.plusMethod(26,32));

//        app03.minusMethod(32,26);
        System.out.println("두 수를 뺸 값은 = " + app03.minusMethod(32,26));

        System.out.println("두 수를 곱한 값은 = " + app03.multipleMethod(26,32));

        System.out.println("두 수를 나눈 값은 = " + app03.divMethod(26,32));



    }

    public int plusMethod(int num1, int num2){
        return num1 + num2;
    }

    public int minusMethod(int num1, int num2){
        return num1 - num2;
    }

    public int multipleMethod(int num1, int num2){
        return num1 * num2;
    }

    public int divMethod(int num1, int num2){
        return num1 / num2;
    }


}
