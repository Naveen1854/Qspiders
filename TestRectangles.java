class  Rectangles{
	int length;
	int width;
	void insert(int l, int w){
		length = l;
		width = w;
	}
	void calculateArea(){
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + length*width);
	}
}
class TestRectangles{
	public static void main(String[] args) {
		Rectangles r1 = new Rectangles(), r2 = new Rectangles();
		r1.insert(11,5);
		r2.insert(3,15);
		r1.calculateArea();
		r2.calculateArea();
	}
}
