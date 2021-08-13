package phone.care.def;

import java.util.Scanner;

import phone.care.mp3_NegativeGuy.Mp3_NegativeGuy;

public class MainClass {
	public static void main(String[] args) {
		
		Mp3_NegativeGuy player = new Mp3_NegativeGuy();
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("---핸드폰 기본 기능---");
		while(true) {
			System.out.println("1.뮤직플레이어");
			System.out.println("2.벨소리 기능");
			System.out.println("3.카메라 기능");
			System.out.println("4.리모컨 기능");
			System.out.print(">>>> : ");
			num=input.nextInt();
			switch(num) {
			case 1:
				player.main(args);
				
				break;
			case 2:
				System.out.println("벨소리 기능");
				break;
			case 3:
				System.out.println("카메라 기능");
				break;
			case 4: 
				System.out.println("리모컨 기능");
			}
		}
	}
}
