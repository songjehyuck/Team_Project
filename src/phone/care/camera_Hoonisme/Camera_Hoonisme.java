package phone.care.camera_Hoonisme;

import java.util.Scanner;

public class Camera_Hoonisme {
	private boolean power;
	private boolean light;
	private boolean video;
	private boolean camera;
	private int time;
	
	
	public void powerOnOff() {
			Scanner in = new Scanner(System.in);
			System.out.println("카메라를 작동 하시겠습니까??(y,n)");

			char answer = in.next().charAt(0);

			if(answer=='y' || answer=='Y') {

				System.out.println("카메라가 켜집니다.");

				this.power = true;

			}

			else {

				System.out.println("카메라를 끕니다.");
				
				this.power= false;
				
				

			}

	}
	public void setPower(boolean power) {

		this.power = power;

	}
	
	
	public boolean getPower() {
		return power;
	}
	
	public boolean getVideo() {
		return video;
	}
	

	public void photoOn() {
			System.out.println("사진기능이 켜집니다.");
				
		}
	public void videoOn() {
		System.out.println("비디오기능이 켜집니다.");
		
	}
			
		
	public void setVideo() {
		Scanner in = new Scanner(System.in);
		System.out.println("계속 촬영 할까요? (y,n)");
		
		char answer = in.next().charAt(0);
		
		if(answer=='y' || answer=='Y') {
			
			System.out.println("계속 촬영합니다.");
			
			this.video = true;
			
		}
		
		else {
			
			this.video= false;
			
			System.out.println("촬영이 꺼집니다.");
			
			
			
			}
	}



public void lightOnOff() {
	Scanner in = new Scanner(System.in);
	System.out.println("라이트 설정 (y,n)");
	
	char answer = in.next().charAt(0);
	
	if(answer=='y' || answer=='Y') {
		
		System.out.println("라이트가 켜집니다.");
		
		this.light = true;
		
	}
	
	else {
		
		this.light= false;
		
		System.out.println("라이트가 꺼집니다.");
		
		
		
		}
	
}



public void setlight(boolean light) {
	
	this.light = light;
	
}
public void setVidieo(boolean video) {
	
	this.video = video;
	
}


public void setTimmer(int time) {
	if(time>3 || time <0) {
		return;
	}
	else {
	for(int i=1;i<=time;i++) {
		System.out.println(i);
	}System.out.println("찍습니다.");
	}
	}

public void displayCh() {
	Scanner in = new Scanner(System.in);
	System.out.println("내,외부 카메라 전환 (i,o)");
	
	char answer = in.next().charAt(0);
	
	if(answer=='i' || answer=='I') {
		
		System.out.println("내부 카메라로 전환합니다.");
		
		this.camera = true;
		
	}
	
	else {
		
		this.camera= false;
		
		System.out.println("외부 카메라로 전환합니다.");
		
		
		
		}
	
}



public void setCamera(boolean camera) {
	
	this.camera = camera;
	
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Camera_Hoonisme cafc = new Camera_Hoonisme();
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
					return;
				}
	}

}









