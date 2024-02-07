// 메소드는 전체적인 흐름만 알아두면 됨.

package com.ohgiraffers.test;

public class Appliation05 {

    public static void main(String[] args) {

        Appliation05 app05 = new Appliation05();
//        String a = app05.testMethod();
        System.out.println(app05.testMethod());

        app05.testMethod1("짱구", 5, '남');
//        System.out.println(app05);

    }
    public String testMethod(){
        return  "안녕하세요";
        //public String testMethod는 void와는 달리 return "안녕하세요"은 그냥 어떠한 것도 아니고
        //값이기 떄문에 main 메소드에서 출력하는 명령문을 작성해야 한다.
    }

    public void testMethod1(String ch, int age, char gender){
        System.out.println("내가 좋아하는 캐릭터 이름은 " + ch + "이고, 걔 나이는 " + "이고, 걔는 " +gender+ "자 꼬맹이야");
        //public void testMethod1는 String 값과는 달리 밑에서 아예 출력문을 입력이 되었기 떄문에
        //main 메소드에서
        //Applicaion05 app05 = new Application05();//이거는 메인 메소드에서 그냥 맨 위에 필수적으로 작성해야 한다.
        //app05.testMethod1("여기 안에다가 값을 밑에 테스트 메소드에서 받아올 값을 입력해야 하낟. ");


    }

}
