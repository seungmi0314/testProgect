package edu.kh.test.testProject;

public class HelloWorld {

public static void main(String[] args) {
	System.out.println("Hello World~!"); //영문
	System.out.println("아침은 드셨나요?"); //한글
	System.out.println("123456"); //숫자
	
	// : 한줄주석
	/*범위주석*/
	
	//" " (쌍따옴표) : 문자열을 나타냄
	// ==>안에 작성 된 텍스트(코드)는 단순 문자열로 인식
	System.out.println("1+2"); // 1+2
	System.out.println(1+2); // 3
	
	//" " 안에 작성되지 않은 문자는 숫자, 변수로 인식

	//""(문자열) + 숫자 함께 작성
	System.out.println("12 * 19 =" + 266);
	//숫자와 숫자끼리의 덧셈은
	//실제 덧셈 연산결과
	//문자열과 숫자 or 문자열과 문자열의 덧셈은 이어쓰기
	System.out.println("14 * 19 = " + 14 *19);
	
	//자바는 사칙연산의 우선순위를 그대로 따른다.
	//ex> 우선계산을 원하면 ()괄호 사용
	
	}
}