
public class Wa {
	private static int end;
	private int start;
	
	public Wa(int s) {
		this.start = s;
	}
	
	public static void setEnd(int v) {
		end = v;
	}
	public void printValues() {
		int flag;
		int i;
		while(end >= start) {
			flag = 0;
			for(i =2; i<end; i++) {
				if(end%i == 0) {
					flag = 1;
					break;
				}
			if(flag == 0)
				System.out.print(i + " ");
			end--;
			}
		}
	}
}
