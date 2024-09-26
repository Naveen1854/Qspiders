package interfaces;

public class Video implements Post,VideoEdit {
	double duration;
	public Video(double duration) {
		this.duration=duration;
	}
	public void trim() {
		System.out.println("I trimed a video");
	}
	@Override
	public void like() {
		System.out.println("I liked Post");
	}
	@Override
	public void share() {
		System.out.println("I shared Post");
	}
	@Override
	public void comment() {
		System.out.println("I commented on Post");
	}
	@Override
	public void mute() {
		System.out.println("I muted the Video");
	}
	@Override
	public void addSong() {
		System.out.println("song added to Video");
	}
	
}
