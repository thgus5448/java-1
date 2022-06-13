package TypeChange_Casting;

//강제 타입 변환(캐스팅)
public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); //자동 타입 변환 : 자식 클래스를 부모 클래스로 변환
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "date2";	//(불가능)
		parent.method3();	//(불가능)
		 */
		
		Child child = (Child) parent;	//강제 타입 변환 : 부모 클래스를 자식 클래스로
		child.field2 = "yyy";	//(가능)
		child.method3(); //(가능)
		
	}
}
