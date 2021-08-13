package phone.care.mp3_NegativeGuy;
import java.util.Scanner;

class Music_Play {
	static int vol=3;
	int music=0;
	int stat=0;
	String dpM = "�� �����..";
	Scanner sc = new Scanner(System.in);
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getVol() {
		return this.vol;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getMusic() {
		return this.music;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public int getStat() {
		return this.stat;
	}
	
	public void display() {
		while(true) {
			System.out.println("====== Music player ======");
			System.out.println("music : "+music+dpM);
			System.out.println("Vol : "+vol);
			System.out.println("1.[>] 2.[||] 3.[>l] 4.[l<]");
			System.out.println("5.[vol] 6.[Exit]");
			System.out.println("==========================");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				play(); break;
			case 2:
				pause(sel); break;			
			case 3:
				next(); break;
			case 4:
				previous(); break;
			case 5:
				volume(); break;
			case 6:
				return;
			}
		}	
	}		
	
	public void play() {
		if(getMusic()==0) {
			System.out.println("��� �� ���ǹ�ȣ �Է�(1~100)");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			if(sel>100) {
				return;
			}
			setMusic(sel);
			dpM = "�� �� ��� ��...";
			return;
		}
		else if(getMusic()!=0) {
			dpM = "�� �� ��� ��...";
			return;
		}		
	}
	
	public void pause(int sel) {
		setStat(sel);
		if(getStat()==2) {
			dpM = "�� ���� ������ϴ�."; 
		}
	}
	
	public void next() {
		if(getMusic()==0) {
		return;
		}
		else if(getMusic()<100 && getMusic() != 0) {
			setMusic(music+1);
			return;
		}
		dpM = "�� ���� ������ ���Դϴ�."; 
	}
	
	public void previous() {
		if(getMusic()==0) {
		}
		else if(getMusic()>100 || getMusic() != 1) {
			setMusic(music-1);
		}
		else dpM = "��° ���Դϴ�."; 
	}
	
	public void volume() {
		System.out.println("���ϴ� ������ �Է����ּ���(0~5)");
		System.out.print(">>> ");
		int vol = sc.nextInt();
		if(vol>5) {
			System.out.println("�ִ� ������ 5�Դϴ�");
			vol = Music_Play.vol;
		}
		else if(vol<6 && vol>=0){
			setVol(vol);
		}
	}
}

public class Mp3_NegativeGuy {
	public static void main(String[] args) {
		Music_Play ex = new Music_Play();
		ex.display();
	}
}
