public class NewCircle {
	private double radius;
	public NewCircle (double radius) {
		this.radius= radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius (double radius) {
		this.radius= radius;
	}

	public double calcArea() {
		return (Math.PI*(radius*radius));
	}
}
	