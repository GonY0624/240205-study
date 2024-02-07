package com.ohgiraffers.test;

public class Application08 {

    public static void main(String[] args) {

        int bet = 81234567;
        method(bet);
    }

    public static void method(int money){

        int result = money*3500;
        int cut1 = result/1000;
        int cut2 = result/1000000;
        int cut3 = result/1000000000;
        // 근데 저거는 그냥 아예 나누는 거니까 몫이 나올 것 같은데
        // 나눠서 ,를 찍어야 됨.
        //



        System.out.println("천의 단위 마다 반점을 출력" + ",");

    }
    //문제 이해한 것을 먼저 적어보자
    //81234567만원을 베팅 진행
    //그것에 대한 결과 값은 배당 배팅한 금액*3500%
    //주어진 금액에 1000의 단위마다 반점을 출력하는 코드 출력
    // 1,000
    // 1,000,000 끊기
    // 1,000,000,000 끊기
    //힌트: 상금은 무조건 10의 자리수이다.

}
