package phone.care.def;

import java.util.Scanner;

import phone.care.remote_WonJiUn.Remote_WonJiUn;

public class MainClass {
	public static void main(String[] args) {
		
		Remote_WonJiUn remote_wonjiun = new Remote_WonJiUn();
		
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
				System.out.println("�����÷��̾�");
				break;
			case 2:
				System.out.println("���Ҹ� ���");
				break;
			case 3:
				System.out.println("ī�޶� ���");
				break;
			case 4: 
				remote_wonjiun.main(args);
				break;
			}
		}
	}
}
