import java.util.*;

public class SetTest {
    public static void main(String[] args) {
  	Set<String> s1 = new HashSet<String>(); // s1 객체 생성
 	Set<String> s2 = new HashSet<String>(); // s2 객체 생성

	s1.add("kim"); // s1 객체에 kim 추가
	s1.add("lee"); // s1 객체에 lee 추가
	s1.add("park"); // s1 객체에 park 추가
	
	s2.add("choi"); // s2 객체에 choi 추가
	s2.add("han"); // s2 객체에 han 추가
	s2.add("kim"); // s2 객체에 kim 추가

	Set<String> union = new HashSet<String>(s1); // union 객체 생성 = s1
	union.addAll(s2); // union을 union 객체와 s2 객체의 합집합으로 만든다.
	Set<String> intersection = new HashSet<String>(s1); // intersection 객체 생성
	intersection.retainAll(s2); // intersection을 intersection 객체와 s2 객체의 교집합으로 만든다.
	System.out.println("합집합" + union ); // 합집합 출력
	System.out.println("교집합" + intersection ); // 교집합 출력
    }
}
