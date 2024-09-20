public class Rectangle {
	private int length;
	private int width;

	public Rectangle (int length, int width) {
		this.length= length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength (int length) {
		this.length= length;
	}
	public int getwidth() {
		return width;
	}
	public void setWidth (int width) {
		this.width= width;
	}
	public int calcArea() {
		return width *length;
	}
	public int calcPerimeter() {
		return 2* (width + length);
	}
	public void draw() {
		for (int i=0;i<this.length;i++) {
			for (int j=0; j< this.width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void scale(int factor) {
		this.setLength((this.getLength())*factor);
		this.setWidth((this.getwidth())*factor);
	}

	public String toString() {
		return ("The length of the rectangle is - " + this.length + "  the width of the rectangle is -  " + this.width);
	}
}	
	
