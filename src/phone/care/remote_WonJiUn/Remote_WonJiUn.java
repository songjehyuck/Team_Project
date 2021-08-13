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
					System.out.println("���� �ø� �� �����ϴ�");
				}
				else{
					vol++;
				}
			return vol;
			}
			else {
				if(vol == 0) {
					vol = 0;
					System.out.println("���� ���� �� �����ϴ�");
				}else
					vol--;
			return vol;
			}
		}
		else {
			System.out.println("������ �����ֽ��ϴ�");
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
				System.out.println("1~3�߿� �ϳ��� �Է����ּ���");
			}
			
	}
	public void list(String str) {
		if(str.equals("����")) {
			System.out.println("���� " + str + " : " + vol);
			System.out.println("1. " + str + " �ø���");
			System.out.println("2. " + str + " ������");
			System.out.println("3. ������");
		}
		else if(str.equals("ä��")) {
			System.out.println("���� " + str + " : " + chan);
			System.out.println("1. " + str + " �ø���");
			System.out.println("2. " + str + " ������");
			System.out.println("3. ������");
		}
	}
	public int channel(int sel) {
		if(pwr == 1) {
			if(sel == 1) {
				if(chan == 30) {
					chan = 30;
					System.out.println("<���� �ø� �� �����ϴ�>");
				}
				else{
					chan++;
				}
			return chan;
			}
			else {
				if(chan == 1) {
					chan = 1;
					System.out.println("<���� ���� �� �����ϴ�>");
				}else
					chan--;
			return chan;
			}
		}
		else {
			System.out.println("<������ �����ֽ��ϴ�>");
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
			System.out.println("<1~3�߿� �ϳ��� �Է����ּ���>");
		}
		
}
	
}


public class Remote_WonJiUn {
public static void main(String[] args) {
		
		//������
		Method m = new Method();
		
		int num = 0;
		boolean flag = m.flag(1);
		int vol = 0, chan = 1;
		String power = "OFF";
		
		while(flag) {
			System.out.println("==== ������ ====");
			System.out.println("�������� : " + power);
			System.out.println("���� : " + m.getVol() + " / ä�� : " + m.getChan());
			System.out.println("1. TV ���� ON/OFF");
			System.out.println("2. ���� ����");
			System.out.println("3. ä�� �̵�");
			System.out.println("4. ����");
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
						m.list("����");
						m.volfunc();
					}while(m.getSel() !=3);
					break;
				case 3:
					do {
						m.list("ä��");
						m.chanfunc();
					}while(m.getSel() !=3);
					break;
					
				case 4: 
					System.out.println("<�������� �����մϴ�>");
					flag = m.flag(0); 
					break;
				default: System.out.println("<1~4�߿� �ϳ��� �Է����ּ���>");
			}
		

		}
		
		
		
		
		
		
		
		
	}
}
