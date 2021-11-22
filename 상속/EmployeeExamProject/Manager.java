public class Manager extends Employee {
	
	private int allowance; // 수당 추가
	
	public Manager( String employeeName, int employeePay, String employeeTelNo, int allowance) {
		super( employeeName, employeePay, employeeTelNo ); // 부모 생성자에게 name, pay, telNo 전달하고 초기화. 
		this.allowance = allowance; // 초기화
	}
	
	// 연봉 계산 재정의 ( 연봉 = 급여 * 12 + 수당 )
	public long calIncome() {
		return super.calIncome() + allowance; // 부모 생성자에게 급여 정보 전달 후 해당 급여에 수당 추가 계산
	}
	
	// 급여 필드에 대한 접근자, 급여만 반환
	public int getAllowance() {
		return allowance; 
	}
	
	// 객체 정보 출력 + 수당 정보 출력
	public void display() {
		super.display(); // 부모 생성자에서 display정보 불러오기
		System.out.println( "수당 : " + allowance ); // 수당 추가 출력
	}
}
