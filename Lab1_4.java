////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_4 : 교재 프로그래밍 실습 8

import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {

		System.out.print("구의 반지름:");
		Scanner sc = new Scanner(System.in);
		double radius, volume, PI;
		PI = 3.141592;

		radius = sc.nextLong();
		volume = radius * radius * radius * PI * 4.0 / 3.0;

		System.out.print("구의 부피:" + volume);
	}

}
