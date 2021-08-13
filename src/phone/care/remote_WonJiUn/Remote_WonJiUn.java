package phone.care.remote_WonJiUn;

import java.util.Scanner;

class Method{
	private Scanner sc = new Scanner(System.in);
	private int sel;
	private int pwr;
	private int vol = 0;
	private int chan = 1;
	
	public int getSel() {
		return sel;
	}
	public int getVol() {
		return vol;
	}
	public int getChan() {
		return chan;
	}
	
	public int select() {
		sel = sc.nextInt();
		return sel;
	}
	public boolean flag(int num) {
		if(num == 1) {
			return true;
		}
		else return false;
	}
	public String power(int pwr) {
		if(pwr == 1) {
			this.pwr = pwr;
			return "ON";
		}
		else {
			this.pwr = pwr;
			return "OFF";
		}
	}
	public int volume(int sel) {
		if(pwr == 1) {
			if(sel == 1) {
				if(vol == 30) {
					vol = 30;
					System.out.println("더는 올릴 수 없습니다");
				}
				else{
					vol++;
				}
			return vol;
			}
			else {
				if(vol == 0) {
					vol = 0;
					System.out.println("더는 내릴 수 없습니다");
				}else
					vol--;
			return vol;
			}
		}
		else {
			System.out.println("전원이 꺼져있습니다");
			return vol;
		}
	}
	public void volfunc() {
		
			sel = select();
			if(sel == 1) {
				vol = volume(1);
			}
			else if(sel == 2) {
				vol = volume(0);
			}
			else if(sel != 3) {
				System.out.println("1~3중에 하나를 입력해주세요");
			}
			
	}
	public void list(String str) {
		if(str.equals("볼륨")) {
			System.out.println("현재 " + str + " : " + vol);
			System.out.println("1. " + str + " 올리기");
			System.out.println("2. " + str + " 내리기");
			System.out.println("3. 나가기");
		}
		else if(str.equals("채널")) {
			System.out.println("현재 " + str + " : " + chan);
			System.out.println("1. " + str + " 올리기");
			System.out.println("2. " + str + " 내리기");
			System.out.println("3. 나가기");
		}
	}
	public int channel(int sel) {
		if(pwr == 1) {
			if(sel == 1) {
				if(chan == 30) {
					chan = 30;
					System.out.println("<더는 올릴 수 없습니다>");
				}
				else{
					chan++;
				}
			return chan;
			}
			else {
				if(chan == 1) {
					chan = 1;
					System.out.println("<더는 내릴 수 없습니다>");
				}else
					chan--;
			return chan;
			}
		}
		else {
			System.out.println("<전원이 꺼져있습니다>");
			return chan;
		}
	}
	public void chanfunc() {
		
		sel = select();
		if(sel == 1) {
			chan = channel(1);
		}
		else if(sel == 2) {
			chan = channel(0);
		}
		else if(sel != 3) {
			System.out.println("<1~3중에 하나를 입력해주세요>");
		}
		
}
	
}


public class Remote_WonJiUn {
public static void main(String[] args) {
		
		//리모컨
		Method m = new Method();
		
		int num = 0;
		boolean flag = m.flag(1);
		int vol = 0, chan = 1;
		String power = "OFF";
		
		while(flag) {
			System.out.println("==== 리모컨 ====");
			System.out.println("현재전원 : " + power);
			System.out.println("볼륨 : " + m.getVol() + " / 채널 : " + m.getChan());
			System.out.println("1. TV 전원 ON/OFF");
			System.out.println("2. 볼륨 조절");
			System.out.println("3. 채널 이동");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			num = m.select();
			
			switch(num){
				case 1:
					System.out.println("1. ON");
					System.out.println("2. OFF");
					System.out.print(">>> ");
					num = m.select();
					if(num == 1) {
						power = m.power(1);
					}
					else {
						power = m.power(0);
					}
					break;
				case 2:
					do {
						m.list("볼륨");
						m.volfunc();
					}while(m.getSel() !=3);
					break;
				case 3:
					do {
						m.list("채널");
						m.chanfunc();
					}while(m.getSel() !=3);
					break;
					
				case 4: 
					System.out.println("<리모컨을 종료합니다>");
					flag = m.flag(0); 
					break;
				default: System.out.println("<1~4중에 하나를 입력해주세요>");
			}
		

		}
		
		
		
		
		
		
		
		
	}
}
