import comp.graphic.Point;
import comp.graphic.PointArray;

public class UsePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointArray parr = new PointArray(10);
		Point p1 = new Point(3, 4);
		Point p2 = new Point(4, 4);
		parr.addPoint(p1);
		parr.addPoint(p2);
		
		System.out.println(parr.getPoint(0));
		
	}
}
