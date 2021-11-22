
public class PointExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point( 10, 10 );
		System.out.println( p.toString() );
		Point3D p3d1 = new Point3D( 10, 20, 30 );
		Point3D p3d2 = new Point3D( 10, 20, 30 );
		
		if( p3d1.equals( p3d2 ) ) {
			System.out.println( "같은 좌표" ); // x, y 좌표가 같으면 "같은좌표" 출력
		} else {
			System.out.println( "다른 좌표" ); // x, y 좌표가 다르면 "다른좌표" 출력
		}
		
		System.out.println( p3d1.toString() ); // 
		p3d1.moveBy( 5,  5, -5 ); // x 좌표 + 5, y 좌표 + 5, z 좌표 - 5 계산해서 출력
		System.out.println( p3d1.toString() );
	}

}
