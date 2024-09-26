package interfaces;

public class Photo implements PhotoEdit,Post{
	int size;
	public Photo(int size) {
		this.size=size;
	}
	public void addPhotos() {
		System.out.println("photos added");
	}
	@Override
	public void addSong() {
		System.err.println("song added");
	}
	@Override
	public void addLocation() {
		System.out.println("Location added");
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
}
