package phone.care.bell_jehyuck;

import java.util.Scanner;

class Bell01{
	boolean power;
	int bellvol=5;
	int vibrvol=3;
	void power() {
		if(power=true) {
			power = true;
		}else {
			power=false;
		}
	}
	void bellvolUp() {
		++bellvol;
	}
	void bellvolDown() {
		--bellvol;
	}
	void vibrvolUp() {
		++vibrvol;
	}
	void vibrvolDown() {
		--vibrvol;
	}
	void mute() {
		bellvol=0;
		vibrvol=0;
	}	
}

public class Bell_jehyuck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		Bell01 b;
		b=new Bell01();
		while(true) {
			System.out.println("1.����");
			System.out.println("2.���Ҹ� ���");
			System.out.println("3.���� ���");
			System.out.println("4.���� ���");
			System.out.println("5.���� ���� \n >>>");
			num=input.nextInt();
			switch(num) {
			case 1:
				b.power();
				if(b.power==true) {
					System.out.println("������ ���Խ��ϴ�.");
				}else {
					System.out.println("������ ���ϴ�.");
				}
				System.out.println("���� ����");
				break;
			case 2:
				if(b.power==true) {
					System.out.println("���� ���Ҹ� ũ��:"+b.bellvol);
					System.out.println("1.���Ҹ� ũ�� up, 2. ���Ҹ� ũ�� down");
					int bellvol01=input.nextInt();
					if(bellvol01==1) {
						if(b.bellvol>=0&&b.bellvol<=10) {
							b.bellvolUp();
						}else {
							System.out.println("�ش� ���Ҹ� ũ��� ���� �Ұ��մϴ�.");
						}
					}else if(bellvol01==2) {
						if(b.bellvol>=0&&b.bellvol<=10) {
							b.bellvolDown();
						}else {
							System.out.println("�ش� ���Ҹ� ũ��� ���� �Ұ��մϴ�.");
						}
					}System.out.println("���� ���Ҹ� ũ�� : "+b.bellvol);
				}else {
					System.out.println("������ ���� Ű����");
				}break;
			case 3:
				if(b.power==true) {
					System.out.println("���� ���� ����:"+b.vibrvol);
					System.out.println("1.���� ���� up, 2. ���� ���� down");
					int vibrvol01=input.nextInt();
					if(vibrvol01==1) {
						if(b.vibrvol>=0&&b.vibrvol<=6) {
							b.vibrvolUp();
						}else {
							System.out.println("�ش� ���� ����� ���� �Ұ��մϴ�.");
						}
					}else if(vibrvol01==2) {
						if(b.vibrvol>=0&&b.vibrvol<=6) {
							b.vibrvolDown();
						}else {
							System.out.println("�ش� ���� ����� ���� �Ұ��մϴ�.");
						}
					}System.out.println("���� ���� ���� : "+b.vibrvol);
				}else {
					System.out.println("������ ���� Ű����");
				}break;
			case 4:
				if(b.power==true) {
					b.mute();
					System.out.println("���� ���´� ���� ����Դϴ�.");
				}else {
					System.out.println("������ ���� Ű����");
				}
				System.out.println("���� ��� ���� => "+"���Ҹ� ũ�� : "+b.bellvol+" ���� ���� : "+b.vibrvol);
				break;
			case 5:
				System.out.println(b.power+","+b.bellvol+","+b.vibrvol);
				break;
			default:
				System.out.println("�ش� ����� �������� �ʽ��ϴ�.");
			}	
		}//���� ��
	}
}
