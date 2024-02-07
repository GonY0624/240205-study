//문제
//Math API를 사용하여 반지름이 주어졌을때
//원의 넓이를 정수형으로 출력하는 메소드를 구현해라.

package com.ohgiraffers.test;

public class Application07 {

    public static void main(String[] args) {
        int radius = 123;
        method(radius);

    }
    public static void method(int radius){
        int result = (int) (radius *(radius) * (Math.PI));
        System.out.println(result);
        //목차. 3. 원주율
        //System.out.println("원주율 : " + Math.PI);
    }

}
