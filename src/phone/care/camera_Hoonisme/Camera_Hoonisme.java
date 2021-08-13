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



}









