package comp.graphic;  // 만드는 명령어 package, 패키지 사용 이유 : 재사용

public class PointArray {
	private Point[] parr;
	private int index = 0;
	
	public PointArray(int size) {
		parr = new Point[size];
	}
	
	public Point getPoint(int index) {
		return parr[index];
	}
	
	public void addPoint(Point p) {
		if( this.index >= parr.length ) {
			System.out.println("배열이 모두 사용됩니다.");
		} else {
			parr[index] = p; 
			index++;
		}
	}
}
