class Rectangle {
	int length;
	int width;
	void insert(int l, int w){
		length = l;
		width = w;
	}
	void calculateArea(){
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area Of Rectangle: " + length*width);
	}
}
	class TeasRectangle{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insert(11,5);
		r2.insert(3,15);
		r1.calculateArea();
		r2.calculateArea();
	}
}
