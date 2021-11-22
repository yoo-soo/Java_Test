
public class Point3D extends Point{
	private int z;
	
	public Point3D( int x, int y, int z ) {
		super( x, y ); //부모의 생성이 먼저
		this.z = z; // z좌표를 저장할 z 변수 추가
	}

	public int getZ() {
		return z;
	}

	public void setZ( int z ) {
		this.z = z;
	}
	
	public void moveBy( int x, int y, int z ) {
		// setX( getX() + x );
		moveBy( x, y ); // x, y는 Point 객체의 moveBy 메서드를 통해 처리
		this.z += z; // z는 Point3D 내의 moveBy 메서드를 통해 처리
	}
	
	// 좌표 재정의 ( z좌표 추가 )
	public String toString() {
		return super.toString() + " z : " + this.z;
	}
	
	// equals 메서드 재정의
	public boolean equals( Point3D p ) {
		if( !super.equals( p ) ) {
			return false;
		} else if( this.z == p.z ) {
			return true;
		} else
			return false;
		}
}
