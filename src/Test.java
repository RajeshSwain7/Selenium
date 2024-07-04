
public class Test {
	Test(){
		System.out.println("none para");
	}
	Test(int i){
		System.out.println("int type");
	}
	Test(String s){
		System.out.println("string type");
	}
	Test(double d){
		System.out.println("double type");
	}
	Test(char d){
		System.out.println("char type");
	}
	Test(float d){
		System.out.println("float type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test();
		Test t2= new Test(100);
		Test t3= new Test("Java");
		Test t4= new Test(1.1);
		Test t5= new Test('q');
		Test t6= new Test(1.00);
		
	}

}
