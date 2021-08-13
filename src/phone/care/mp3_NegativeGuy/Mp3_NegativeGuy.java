package phone.care.mp3_NegativeGuy;
import java.util.Scanner;

class Music_Play {
	static int vol=3;
	int music=0;
	int stat=0;
	String dpM = "곡 대기중..";
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
			System.out.println("재생 할 음악번호 입력(1~100)");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			if(sel>100) {
				return;
			}
			setMusic(sel);
			dpM = "번 곡 재생 중...";
			return;
		}
		else if(getMusic()!=0) {
			dpM = "번 곡 재생 중...";
			return;
		}		
	}
	
	public void pause(int sel) {
		setStat(sel);
		if(getStat()==2) {
			dpM = "번 곡을 멈췄습니다."; 
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
		dpM = "번 곡은 마지막 곡입니다."; 
	}
	
	public void previous() {
		if(getMusic()==0) {
		}
		else if(getMusic()>100 || getMusic() != 1) {
			setMusic(music-1);
		}
		else dpM = "번째 곡입니다."; 
	}
	
	public void volume() {
		System.out.println("원하는 볼륨을 입력해주세요(0~5)");
		System.out.print(">>> ");
		int vol = sc.nextInt();
		if(vol>5) {
			System.out.println("최대 볼륨은 5입니다");
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
