package com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다.  */
        /* 필기.
        *   매개변수롸 리턴값 복합활용
        *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
        *  */

        int first = 20;
        int second = 10;

        Application07 app07 = new Application07();
        //static메소드를 사용하는 호출하는 방식이 다른점,
        //static 메소드는 클레스명.메소드명(); < 다음과 같이 호출
        System.out.println("두 수를 더한 결과: " + app07.plusTwoNumbers(first,second));
        System.out.println("두 수를 뺀 결과: " + app07.minusTwoNumbers(first,second));
        System.out.println("두 수를 곱한 결과: " + app07.multipleTwoNumbers(first,second));
        System.out.println("두 수를 나눈 결과: " + app07.divTwoNumbers(first,second));

    }

    /** 문서화 주석
     * <pre>
     *     매개변수로 전달 받은 두 수를 더하여 반환하는 기능 제공
     * </pre>
     * @param first1 더하기를 할 첫 번째 정수
     * @param second1 더하기를 할 두 번쨰 정수
     * @return 매개변수로 전달 받은 두 수를 더한 결과
     * */

    public int plusTwoNumbers(int first1, int second1 ){

        return  first1 + second1;

    }

    public int minusTwoNumbers(int first1, int second1){

        return  first1 - second1;

    }

    public int multipleTwoNumbers(int first1, int second1){

        return  first1 * second1;

    }

    public int divTwoNumbers(int first1, int second1){

        return  first1 / second1;

    }

}