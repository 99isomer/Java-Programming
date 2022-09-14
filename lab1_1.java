////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_1 : 교재 프로그래밍 실습 1

import java.util.Scanner;

public class lab1_1 {

	public static void main(String[] args) {

		System.out.print("오렌지의 개수 입력 :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int box = (number / 10);
		int left = (number % 10);

		System.out.println(box + "박스가 필요하고 " + left + "개가 남습니다.");

	}

}
