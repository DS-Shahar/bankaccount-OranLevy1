import java.io.Reader;
import java.util.Scanner;

public class Main {
	public static Scanner reader= new Scanner (System.in);
	public static void main(String[] args) {
		int len1 = reader.nextInt();
		int wid1 = reader.nextInt();
		int len2 = reader.nextInt();
		int wid2 = reader.nextInt();
		Rectangle rec1 = new Rectangle (len1,wid1);
		Rectangle rec2 = new Rectangle (len2,wid2);
		System.out.println(rec1.toString() + "\n" + rec2.toString());
		rec1.draw();
		rec2.draw();
		rec1.scale(2);
		System.out.println("new rectangle : "); 
		rec1.draw();
		int rec1_area= rec1.calcArea();
		int rec2_area= rec2.calcArea();
		System.out.println("area sum - " + ( rec1_area  + rec2_area));
		int rec1_perimeter= rec1.calcPerimeter();
		int rec2_perimeter= rec2.calcPerimeter();
		System.out.println("Perimeter sum - " + ( rec1_perimeter  + rec2_perimeter));
		
	}

}
