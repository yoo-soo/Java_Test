/*
 * 
 */
public class Array {
	/*
	public void reverse( int[] arrs ) {
		for( int i = arrs.length - 1; i >= 0; i--) {
			System.out.println(arrs[i]);
		} 
	} // Array a = new Array();
	  // a.reverse(new int[]{1,2,3,4,5} );
	*/
	public static <T> void reverse(T[] arrs) {
		for( int i = arrs.length - 1; i >= 0; i-- ) {
			System.out.print( arrs[i] + " " );
		}
	} // Array.reverse(new int[]{1,2,3,4,5}); 
	  // static 메서드를 사용할 때는 객체 생성이 필요없이 클래스 이릉으로 접근한다.
	
	   
}
