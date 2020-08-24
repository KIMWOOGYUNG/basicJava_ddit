package e_oop;

public class JVM_Memory {
	/* //c와 다르게 자바는 메모리 해제 필요x(알아서 해줌)
	 * 
	 * << JVM(Java Virtual Machine >>
	 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 * - 운영체제 -> JVM -> 자바 프로그램
	 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
	 * - 단점 : 속도가 느리다.
	 * 
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 * << Method Area : 클래스>>
	 * Math
	 * random()
	 * System
	 * out
	 * ClassMember
	 * ClassVar : 클래스변수 변경 //객체 통해서나 클래스 통해서나 같은 참조
	 * classMethod()
	 * 
	 * << Call Stack : 실행중인 메서드>> 
	 * //실행 후 종료되면 삭제
	 * main()
	 * random() : 실행 후 삭제
	 * println() : 삭제 //out 변수에 담겨있는걸 불러옴
	 * println() : 삭제
	 * println() : 삭제
	 * instanceMethod() : 삭제
	 * println() : 삭제
	 * classMethod() : 삭제
	 * 
	 * << Heap  : 객체>>
	 * //객체가 더이상 참조되지 않을때 garbage collector가 가져감
	 * cm1(ClassMember)
	 * instanceVar : 인스턴스 변수 //객체끼리는 각각의 값을 가짐 그래서 변경 후 또 생김
	 * instanceMethod()
	 * cm2(ClassMember)
	 * instanceVar : 인스턴스 변수 변경
	 * instanceMethod()
	 */
}
