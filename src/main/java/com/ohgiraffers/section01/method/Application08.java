package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        /* 필기.
        *   static 메소드 호출
        *  */

        /* 필기.
        *   static 메소드 호출하는 방법
        *   클래스명.메소드명(); <-이런방식으로 호출한다.
        *  */

        System.out.println("10과 20의 합: " + Application08.sumTwuNumbers(10,20));
        //new 라는 키워드가 없어도 static 메소드는 이런식으로 호출이 가능하다.

        /* 필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략이 가능하다.  */
        System.out.println("20과 30의 합: " + sumTwuNumbers(20,30));

    }

    //메소드의 기능: 특정한 기능을 하기 위한 메소드의 집합
    public static int sumTwuNumbers(int first, int second){

        return first + second;
    }

}
