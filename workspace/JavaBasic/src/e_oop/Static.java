package e_oop;

public class Static {

	public static void main(String[] args) {
		/*
		 * << Static 사용 이유 >>
		 * - 객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다.
		 * - 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 * - static이 붙은 것 : 클래스 멤버(클래스 변수, 클래스 메서드)
		 * - 클래스 멤버 : 메모리에 클래스가 저장될 때 같이 저장된다.
		 * - static이 붙지 않은 것 : 인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)
		 * - 인스턴스 멤버 : 메모리에 인스턴스가 저장될 때 같이 저장된다.
		 */
		
		//static이 붙은 메서드
		//static이 붙어 객체생성 없이 사용가능
		Math.random();
		System.out.println(); 
		
		System.out.println(ClassMember.classVar); //객체 접근이 아니라 클래스명.으로 접근
		ClassMember.classMethod();
		
		//객체 생성 후 인스턴스 변수/메서드 호출
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		
		//객체 생성 후 클래스 변수/메서드 호출
		System.out.println(cm1.classVar);
		cm1.classMethod();
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		
//static 안붙인거-------------------------------------------------------------------		
		ClassMember cm2 = new ClassMember();  //객체생성을 한다음 변경할 수 있음
		cm2 = null; //더이상 참조되지 않으니 이때 garbage collector가 수거!
		
		System.out.println("변경 전");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		cm2.instanceVar = "인스턴스 변수 변경";
		
		System.out.println("변경 후");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);

//static 붙인거---------------------------------------------------------------------
		System.out.println("변경 전");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : " + cm1.classVar);
		System.out.println("cm2 : " + cm2.classVar);
		
		ClassMember.classVar = "클래스 변수 변경";  //객체 생성 없이 클래스에서 바로 불러와 변경
		
		System.out.println("변경 후");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : " + cm1.classVar);
		System.out.println("cm2 : " + cm2.classVar);
	}

}
