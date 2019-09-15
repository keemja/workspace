package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodMorningMessage3 {
    private static String getGoodMorningMessage(String to) {
        String from = null;

        // String 간 비교할 때 하나는 null 가능성이 있고 하나는 확실히 없으면,
        // null 가능성이 없는 애의 equals 함수를 호출하면 null 익셉션을 피할 수 있음
        if (("김혜림").equals(to)) {
            from = "이진욱";
        } else if (("김주아").equals(to)) {
            from = "박보검";
        }

        if (from != null) {
            return String.format("%s : %s 굿모닝!", from, to);
        }

        throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
    }

    public static void main(String[] args) {
        String to;
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        // 과제2 : while 안 쓰고 for문 쓰면서 exit 확인을 for문 조건안에서 하기
        // 힌트: for 문에서 보통 int i 로 쓰던 부분을 String 으로 쓰기
        // 반복문 조건은 가능하면 거기다가 넣는게 좋음
        // 무한반복에 안에서 break 는 필요할 땐 쓰지만 별로 좋지 않음
        // for(입력 받기; true 인 동안 반복; 루프 한번 실행 후 실행)
        for (to = sc.nextLine(); !"exit".equals(to); to = sc.nextLine()) {
            try {
                System.out.println(getGoodMorningMessage(to));
                list.add(getGoodMorningMessage(to));
            } catch (Exception e) {
                list.add(e.getMessage());
                System.out.println(e.getMessage());
            }
        }
        for (String result : list) {
            System.out.println(result);
        }
    }
}