package interfaces;

public class Execute {

	public static void main(String[] args) {
		Photo p1 = new Photo(4);
//		p1.addSong();
		p1.addLocation();
		p1.addPhotos();
		
		Video v1 = new Video(4.5);
		v1.like();
		v1.share();
		v1.comment();
		v1.mute();
		v1.addSong();
		v1.trim();
	}

}
