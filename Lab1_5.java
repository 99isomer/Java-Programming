
////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_5 

import java.util.Scanner;

public class Lab1_5 {

	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner sc = new Scanner(System.in);

		int number, tenth, first;
		number = sc.nextInt();
		tenth = number / 10;
		first = number % 10;

		System.out.print((tenth == first) ? "Yes! 10의 자리와 1의 자리가 같습니다" : "No! 10의 자리와 1의 자리가 다릅니다");
	}

}
