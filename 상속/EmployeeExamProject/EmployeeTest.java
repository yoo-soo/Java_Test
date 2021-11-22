
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Yoo", 12000000, "01011111111"); // 직원1에 대한 정보 설정
		Employee e2 = new Employee("Lee", 1000000, "01022222222"); // 직원2에 대한 정보 설정
		Employee e3 = new Employee("Kim", 12000000, "01033333333"); // 직원3에 대한 정보 설정
		Manager m1 = new Manager("Park", 3000000, "01044444444", 800000); // 매니저1에 대한 정보 설정
		
		e1.calIncome(); // 직원1 급여 계산
		e2.calIncome(); // 직원2 급여 계산
		e3.calIncome(); // 직원3 급여 계산
		e1.display(); // 직원1에 대한 정보 출력
		e2.display(); // 직원2에 대한 정보 출력
		e3.display(); // 직원3에 대한 정보 출력
		
		e3.setData(2000000); // 직원3 급여 2백만원으로 변경
		e3.calIncome(); // 재계산
		e3.display(); // 직원3에 대한 정보 출력
		
		System.out.println( m1.getPay() );
		
		System.out.println( e3.getPay() ); // 직원3의 급여 출력
		
		System.out.println( Employee.getEmployeeCount() ); // 직원 수 출력
	
		m1.calIncome();
		m1.display(); // 매니저1에 대한 정보 출력
		m1.setData(4000000); // 급여 4백만원으로 변경
		m1.calIncome(); // 재계산
		m1.display(); // 매니저1에 대한 정보 출력
	}

}
