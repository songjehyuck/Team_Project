package phone.care.def;

import java.util.Scanner;

<<<<<<< HEAD
import phone.care.mp3_NegativeGuy.Mp3_NegativeGuy;
=======

import phone.care.camera_Hoonisme.Camera_Hoonisme;

import phone.care.remote_WonJiUn.Remote_WonJiUn;

>>>>>>> master

public class MainClass {
	public static void main(String[] args) {
		
<<<<<<< HEAD
		Mp3_NegativeGuy player = new Mp3_NegativeGuy();
=======
		Remote_WonJiUn remote_wonjiun = new Remote_WonJiUn();
>>>>>>> master
		
		Scanner input = new Scanner(System.in);
		
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
				break;
			case 3:
				System.out.println("ī�޶� ���");
				cafc.main(args);
			case 4: 
				remote_wonjiun.main(args);
				break;

			}
		}
	}
}


