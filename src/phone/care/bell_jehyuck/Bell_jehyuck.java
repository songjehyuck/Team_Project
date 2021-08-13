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
			System.out.println("1.전원");
			System.out.println("2.벨소리 모드");
			System.out.println("3.진동 모드");
			System.out.println("4.무음 모드");
			System.out.println("5.현재 상태 \n >>>");
			num=input.nextInt();
			switch(num) {
			case 1:
				b.power();
				if(b.power==true) {
					System.out.println("전원이 들어왔습니다.");
				}else {
					System.out.println("전원을 끕니다.");
				}
				System.out.println("전원 선택");
				break;
			case 2:
				if(b.power==true) {
					System.out.println("현재 벨소리 크기:"+b.bellvol);
					System.out.println("1.벨소리 크기 up, 2. 벨소리 크기 down");
					int bellvol01=input.nextInt();
					if(bellvol01==1) {
						if(b.bellvol>=0&&b.bellvol<=10) {
							b.bellvolUp();
						}else {
							System.out.println("해당 벨소리 크기는 설정 불가합니다.");
						}
					}else if(bellvol01==2) {
						if(b.bellvol>=0&&b.bellvol<=10) {
							b.bellvolDown();
						}else {
							System.out.println("해당 벨소리 크기는 설정 불가합니다.");
						}
					}System.out.println("현재 벨소리 크기 : "+b.bellvol);
				}else {
					System.out.println("전원을 먼저 키세요");
				}break;
			case 3:
				if(b.power==true) {
					System.out.println("현재 진동 세기:"+b.vibrvol);
					System.out.println("1.진동 세기 up, 2. 진동 세기 down");
					int vibrvol01=input.nextInt();
					if(vibrvol01==1) {
						if(b.vibrvol>=0&&b.vibrvol<=6) {
							b.vibrvolUp();
						}else {
							System.out.println("해당 진동 세기는 설정 불가합니다.");
						}
					}else if(vibrvol01==2) {
						if(b.vibrvol>=0&&b.vibrvol<=6) {
							b.vibrvolDown();
						}else {
							System.out.println("해당 진동 세기는 설정 불가합니다.");
						}
					}System.out.println("현재 진동 세기 : "+b.vibrvol);
				}else {
					System.out.println("전원을 먼저 키세요");
				}break;
			case 4:
				if(b.power==true) {
					b.mute();
					System.out.println("현재 상태는 무음 모드입니다.");
				}else {
					System.out.println("전원을 먼저 키세요");
				}
				System.out.println("현재 모드 상태 => "+"벨소리 크기 : "+b.bellvol+" 진동 세기 : "+b.vibrvol);
				break;
			case 5:
				System.out.println(b.power+","+b.bellvol+","+b.vibrvol);
				break;
			default:
				System.out.println("해당 기능은 존재하지 않습니다.");
			}	
		}
	}
}
