package phone.care.def;

import java.util.Scanner;

import phone.care.mp3_NegativeGuy.Mp3_NegativeGuy;
import phone.care.bell_jehyuck.Bell_jehyuck;
import phone.care.camera_Hoonisme.Camera_Hoonisme;

import phone.care.remote_WonJiUn.Remote_WonJiUn;


public class MainClass {
	public static void main(String[] args) {
		
		Mp3_NegativeGuy player = new Mp3_NegativeGuy();
		
		Remote_WonJiUn remote_wonjiun = new Remote_WonJiUn();
		
		Scanner input = new Scanner(System.in);
		
		Bell_jehyuck bell = new Bell_jehyuck();
		
		Camera_Hoonisme cafc = new Camera_Hoonisme();
		
		int num;
		System.out.println("---�ڵ��� �⺻ ���---");
		while(true) {
			System.out.println("1.�����÷��̾�");
			System.out.println("2.���Ҹ� ���");
			System.out.println("3.ī�޶� ���");
			System.out.println("4.������ ���");
			System.out.print(">>>> : ");
			num=input.nextInt();
			switch(num) {
			case 1:
				player.main(args);				
				break;
			case 2:
				System.out.println("���Ҹ� ���");
				bell.main(args);
				break;
			case 3:
				System.out.println("ī�޶� ���");
				cafc.main(args);
				break;
			case 4: 
				remote_wonjiun.main(args);
				break;

			}
		}
	}
}


