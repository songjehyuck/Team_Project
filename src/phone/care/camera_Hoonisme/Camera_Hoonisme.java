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
			System.out.println("ī�޶� �۵� �Ͻðڽ��ϱ�??(y,n)");

			char answer = in.next().charAt(0);

			if(answer=='y' || answer=='Y') {

				System.out.println("ī�޶� �����ϴ�.");

				this.power = true;

			}

			else {

				System.out.println("ī�޶� ���ϴ�.");
				
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
			System.out.println("��������� �����ϴ�.");
				
		}
	public void videoOn() {
		System.out.println("��������� �����ϴ�.");
		
	}
			
		
	public void setVideo() {
		Scanner in = new Scanner(System.in);
		System.out.println("��� �Կ� �ұ��? (y,n)");
		
		char answer = in.next().charAt(0);
		
		if(answer=='y' || answer=='Y') {
			
			System.out.println("��� �Կ��մϴ�.");
			
			this.video = true;
			
		}
		
		else {
			
			this.video= false;
			
			System.out.println("�Կ��� �����ϴ�.");
			
			
			
			}
	}



public void lightOnOff() {
	Scanner in = new Scanner(System.in);
	System.out.println("����Ʈ ���� (y,n)");
	
	char answer = in.next().charAt(0);
	
	if(answer=='y' || answer=='Y') {
		
		System.out.println("����Ʈ�� �����ϴ�.");
		
		this.light = true;
		
	}
	
	else {
		
		this.light= false;
		
		System.out.println("����Ʈ�� �����ϴ�.");
		
		
		
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
	}System.out.println("����ϴ�.");
	}
	}

public void displayCh() {
	Scanner in = new Scanner(System.in);
	System.out.println("��,�ܺ� ī�޶� ��ȯ (i,o)");
	
	char answer = in.next().charAt(0);
	
	if(answer=='i' || answer=='I') {
		
		System.out.println("���� ī�޶�� ��ȯ�մϴ�.");
		
		this.camera = true;
		
	}
	
	else {
		
		this.camera= false;
		
		System.out.println("�ܺ� ī�޶�� ��ȯ�մϴ�.");
		
		
		
		}
	
}



public void setCamera(boolean camera) {
	
	this.camera = camera;
	
}



}









