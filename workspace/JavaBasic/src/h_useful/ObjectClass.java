package h_useful;

public class ObjectClass {

	public static void main(String[] args) {
		//toString() : 객체에 대한 정보를 문자열로 제공한다.
		ObjectClass oc = new ObjectClass();
		System.out.println(oc); //객체의 주소가 나온다.
		System.out.println(oc.toString()); //객체의 주소가 나온다.
		
		

	}

	@Override
	public String toString() {
		return "toString() 메서드 호출"; //오버라이딩으로 주소대신 문자열을 반환
	}

}
