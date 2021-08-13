package phone.care.def;

import java.util.Scanner;

import phone.care.camera_Hoonisme.Camera_Hoonisme;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Camera_Hoonisme cafc = new Camera_Hoonisme();
		
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
				cafc.powerOnOff();
			if(cafc.getPower()== true) {
					while(true) {
						System.out.println("1.사진 기능");
						System.out.println("2.동영상 기능");
						System.out.println("3.화면전환 기능");
						System.out.println("4.종료");
						System.out.print(">>>");
						int r = input.nextInt();
						if(r == 1) {cafc.photoOn();
						while(true) {
						
						System.out.println("1.사진 찍기");	
						System.out.println("2.라이트 키기");	
						System.out.println("3.타이머 기능");	
						System.out.println("4.종료");	
						System.out.print(">>>");	
						int c = input.nextInt();
							switch(c) {
							case 1: System.out.println("브이 하세요~");continue;
							
							case 2: cafc.lightOnOff();continue;
									
							case 3:
								System.out.print("타이머 설정 : ");
								int t = input.nextInt(); 
								cafc.setTimmer(t);
								continue;
								
							case 4 :break;	
							}break;
							}
						}
						else if(r == 2) {cafc.videoOn();
						while(true) {
							System.out.println("1.동영상 찍기");	
							System.out.println("2.라이트 키기");	
							System.out.println("3.종료");	
							System.out.print(">>>");	
							int c = input.nextInt();
						
							switch(c) {
							case 1 : System.out.println("촬영을 시작합니다.");
									 cafc.setVideo();continue;
							case 2 : cafc.lightOnOff();continue;
							
							case 3 : break;
							 		 
							}break;
						}
							
						}
						else if(r == 3) {cafc.displayCh();
							
						}
						else if(r == 4) {
							System.out.println("카메라를 종료합니다.");
							break;
						}
					}
					}
					else {
						break;
					}
			
			
		case 4: 
			System.out.println("리모컨 기능");
			}
		}
	}
}


