package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 메소드의호출 흐름을 연습해보자. */
        System.out.println("main 프로그램이 시작됩니다. . .");

        Application01 app01 = new Application01(); // 대입연산자 오른쪽은 공간, 왼쪽은 값
        app01.testMethod1();

        System.out.println("main 프로그램이 모든 작업을 종료 후 없어집니다. . .");

    }

    public void testMethod1(){
        System.out.println("안녕 나는 testMethod1이란다 불렀니?");

        testMethod2();

        System.out.println("나는 내 용무를 마쳤으니 간다 뿅");

    }

    public void testMethod2(){ // VOID는 자기가 만들었던 코드를 다 실행하면 아무것도 가진 것 없이 돌아간다.

        System.out.println("안녕 나는 testMethod2 이야 나랑 친구할래?");

//        testMethod3();// 이렇게만 하면 그냥 값이기 때문에 출력이 안된다.
//        System.out.println(testMethod3()); //이 출력문이 없으면 그냥 값이다. , 값 자체를 출력문에 넣어서 출력을 한 상태
        
        String hi = testMethod3();
        System.out.println(hi); // 값을 변수 공간에 담아서 출력을 한 상태

        System.out.println("하기 싫으면 말고 testMethod2 갈꺼다! 안녕~");

        //return;//void에서는 생략!, return 0;이라고도 생각을 하면 안됨. 0도 변수이기 때문에
    }

    //String 같은 값을 가지고 돌아갈건데 자료형이 문자열이야.
    public String testMethod3(){

        //void가 아니면 반드시 return 구문을 해야한다.
        return "안녕 불렀어?"; //그냥 값임.

    }

}
//예측:
//main 프로그램이 시작됩니다. . .
//안녕 나는 testMethod1이란다 불렀니?
//안녕 나는 testMethod2 이야 나랑 친구할래?
//안녕 불렀어?
//하기 싫으면 말고 testMethod2 갈꺼다! 안녕~
//나는 내 용무를 마쳤으니 간다 뿅
//main 프로그램이 모든 작업을 종료 후 없어집니다. . .