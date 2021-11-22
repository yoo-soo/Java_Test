public class Point {
	// 멤버 변수는 객체지향의 특성 상 외부로부터 보호되어야 되면 따라서 private로 선언.
	private int x; // x 좌표값을 저장할 정수형 멤버변수
	private int y; // y 좌표값을 저장할 정수형 멤버변수
	
	public Point() {
		this( 0, 0 );
	}
	
	public Point( int v ) {
		this( v, v );
	}
	
	public Point( int x, int y ) {
		
		if ( x < 0 || y < 0) {
			x = y = 0;
		}
		else {
			this.x = x;
			this.y = y;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX( int x ) {
		this.x = x;
	}
	
	public void setY( int y ) {
		this.y = y;
	}
	
	public void moveBy( int x, int y ) {
		this.x += x; // 원래의 x값에 내가 받은 만큼 +
		this.y += y; // 원래의 y값에 내가 받은 만큼 +
	}
	
	public String toString() {
		return "x : " + x + " y : " + y;
	}
	
	public boolean equals( Point p ) {
		if( this.x == p.x && this.y == p.y )
			return true;
		else
			return false;
	}
}
