package com.ohgiraffers.test;

public class Applicaion02 {

    public static void main(String[] args) {

        System.out.println("main 메소드 동작 실행 ...");
     
        Applicaion02 app02 = new Applicaion02(); // 내가 가지고 있는 재료들을 값을 꺼내 준비한다.
        app02.testMethod1(100);

        int result = app02.testMethod2(200);
        System.out.println("result = " + result);

        app02.testMethod3("정고은", 26, '여');

        System.out.println("main 메소드 동작 종료 ...");

    }
    
    public void testMethod1(int num){

        System.out.println(++num);
    }

    public int testMethod2(int num){

        return num;
    }

    public void testMethod3(String name, int age, char gender){
        System.out.println("내 이름은 " + name + "이고, 나이는 " + age + "이고, 성별은 " + gender + "자 입니다. ");

    }

}
