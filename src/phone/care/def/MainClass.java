package phone.care.def;

import java.util.Scanner;

import phone.care.camera_Hoonisme.Camera_Hoonisme;

public class MainClass {
	public static void main(String[] args) {
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
				System.out.println("�����÷��̾�");
				break;
			case 2:
				System.out.println("���Ҹ� ���");
				break;
			case 3:
				System.out.println("ī�޶� ���");
				cafc.powerOnOff();
			if(cafc.getPower()== true) {
					while(true) {
						System.out.println("1.���� ���");
						System.out.println("2.������ ���");
						System.out.println("3.ȭ����ȯ ���");
						System.out.println("4.����");
						System.out.print(">>>");
						int r = input.nextInt();
						if(r == 1) {cafc.photoOn();
						while(true) {
						
						System.out.println("1.���� ���");	
						System.out.println("2.����Ʈ Ű��");	
						System.out.println("3.Ÿ�̸� ���");	
						System.out.println("4.����");	
						System.out.print(">>>");	
						int c = input.nextInt();
							switch(c) {
							case 1: System.out.println("���� �ϼ���~");continue;
							
							case 2: cafc.lightOnOff();continue;
									
							case 3:
								System.out.print("Ÿ�̸� ���� : ");
								int t = input.nextInt(); 
								cafc.setTimmer(t);
								continue;
								
							case 4 :break;	
							}break;
							}
						}
						else if(r == 2) {cafc.videoOn();
						while(true) {
							System.out.println("1.������ ���");	
							System.out.println("2.����Ʈ Ű��");	
							System.out.println("3.����");	
							System.out.print(">>>");	
							int c = input.nextInt();
						
							switch(c) {
							case 1 : System.out.println("�Կ��� �����մϴ�.");
									 cafc.setVideo();continue;
							case 2 : cafc.lightOnOff();continue;
							
							case 3 : break;
							 		 
							}break;
						}
							
						}
						else if(r == 3) {cafc.displayCh();
							
						}
						else if(r == 4) {
							System.out.println("ī�޶� �����մϴ�.");
							break;
						}
					}
					}
					else {
						break;
					}
			
			
		case 4: 
			System.out.println("������ ���");
			}
		}
	}
}


