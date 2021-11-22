public class Employee {
	// 멤버 변수 -> 클래스 멤버 -> 클래스 이름+멤버
	//		, 인스턴스 멤버 -> new로 생성해서 사용 -> 객체변수.멤버
	// 멤버 메서드 -> 클래스 메서드		static이 붙은 메서드 - 클래스 멤버의 사용
	// 				인스턴스 메서드  x                - 인스턴스 멤버의 사용
	
	private String employeeName; // 이름 변수
	private int employeePay;	// 급여 변수  // int +- 21억 -> long
	private String employeeTelNo; // 전화번호 변수
	private long yearPay; // 연봉 변수
	private static int employeeCount;
	
	// 이름, 급여, 전화번호 초기화
	public Employee(String employeeName, int employeePay, String employeeTelNo) { // 매개변수에 employeeName, employeePay, employeeTelNo
		this.employeeName = employeeName; // 내가 가지고 있는 employeeName 멤버 변수에 employeeName 매개변수 넣어줌 
		this.employeePay = employeePay; // 내가 가지고 있는 employeePay 멤버 변수에 employeePay 매개변수 넣어줌
		this.employeeTelNo = employeeTelNo; // 내가 가지고 있는 employeeTelNo 멤버 변수에 employeeTelNo 매개변수 넣어줌
		Employee.employeeCount++; // 직원 +1 증가.
	}
	
	// 연봉 계산
	public long calIncome() { 
		yearPay = employeePay * 12; // 급여 x 12개월(1년) yearPay 변수에 계싼
		return yearPay; // return
	}
	
	// 이름, 급여, 전화번호, 연봉에 대한 정보 출력
	public void display() {
		System.out.println("이름 : " + employeeName);
		System.out.println("급여 : " + employeePay);
		System.out.println("전화번호 : " + employeeTelNo);
		System.out.println("연봉 : " + yearPay);
	}
	
	// 급여에 대한 정보 변경 설정
	public void setData(int employeePay) {
		this.employeePay = employeePay; // 직원 급여 재설정
	}
	
	// 전화번호에 대한 정보 변경 설정
	public void setData(String employeetelNo) {
		this.employeeTelNo = employeeTelNo; // 직원 전화번호 재설정
	}

	public int getPay() {
		return this.employeePay; // 직원 급여 필드에 대한 접근자, 급여 반환
	}
	
	public static int getEmployeeCount() { // static 멤버에서는 인스턴스 멤버 호출 x
		return employeeCount; // 직원 수 반환
	}
}
