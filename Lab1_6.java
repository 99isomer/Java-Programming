////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_6

import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		System.out.print("정수 두 개 입력: ");
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("x&y=" + (x & y) + "		");
		System.out.print("x|y=" + (x | y) + "		");
		System.out.print("x^y=" + (x ^ y) + "      ");
		System.out.println("~x=" + (~x) + "		");
		System.out.print("x>>2=" + (x >> 2) + "     ");
		System.out.print("x<<2=" + (x << 2) + "     ");
		System.out.print("x>>>2=" + (x >>> 2) + "     ");

	}

}
