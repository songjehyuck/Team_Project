package phone.care.def;

import java.util.Scanner;

import phone.care.mp3_NegativeGuy.Mp3_NegativeGuy;

public class MainClass {
	public static void main(String[] args) {
		
		Mp3_NegativeGuy player = new Mp3_NegativeGuy();
		
		Scanner input = new Scanner(System.in);
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
				break;
			case 4: 
				System.out.println("������ ���");
			}
		}
	}
}
