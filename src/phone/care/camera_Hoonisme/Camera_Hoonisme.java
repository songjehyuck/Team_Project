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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Camera_Hoonisme cafc = new Camera_Hoonisme();
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
					return;
				}
	}

}









