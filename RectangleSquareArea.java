import java.util.Scanner;
public class RectangleSquareArea{
	public static void main(String[] args) 
	  {

	Scanner newScanx =  new Scanner(System.in);
	Scanner newScany =  new Scanner(System.in);
	Scanner newScanl =  new Scanner(System.in);


	System.out.println("Enter width:");
	String width2 = newScanx.nextLine();
	
	System.out.println("Enter length:");
	String l2 = newScanl.nextLine();

	int width = Integer.parseInt(width2);
	
	int length = Integer.parseInt(l2);
	

	  Square sq = new Square(length);
	  Square rec = new Square(length, width);
	  System.out.println(sq.getArea()); 
	  System.out.println(rec.getArea());

	  }
}


