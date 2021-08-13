package phone.care.def;

import java.util.Scanner;

import phone.care.remote_WonJiUn.Remote_WonJiUn;

public class MainClass {
	public static void main(String[] args) {
		
		Remote_WonJiUn remote_wonjiun = new Remote_WonJiUn();
		
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
				System.out.println("뮤직플레이어");
				break;
			case 2:
				System.out.println("벨소리 기능");
				break;
			case 3:
				System.out.println("카메라 기능");
				break;
			case 4: 
				remote_wonjiun.main(args);
				break;
			}
		}
	}
}
