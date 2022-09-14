////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_2 : 교재 프로그래밍 실습 3

import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, sum, gap, multiply, max_value, min_value;
		double average;

		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();

		sum = x + y;
		gap = x - y;
		multiply = x * y;
		average = (x + y) / 2.0;
		max_value = (x > y) ? x : y;
		min_value = (x < y) ? x : y;

		System.out.println("두수의 합: " + sum);
		System.out.println("두수의 차: " + gap);
		System.out.println("두수의 곱: " + multiply);
		System.out.println("두수의 평균: " + average);
		System.out.println("큰수: " + max_value);
		System.out.print("작은수: " + min_value);

	}

}
