////////////////////////
//신아인(2016322)
//2022-09-13
//Lab1_3 : 교재 프로그래밍 실습 6

import java.util.Scanner;

public class Lab1_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String drive, directory, filename, extension;

		System.out.print("드라이브 이름: ");
		drive = sc.nextLine();
		System.out.print("디렉터리 이름: ");
		directory = sc.nextLine();
		System.out.print("파일 이름: ");
		filename = sc.nextLine();
		System.out.print("확장자: ");
		extension = sc.nextLine();

		System.out.println("완전한 이름은 " + drive + directory + filename + "." + extension);
	}

}
