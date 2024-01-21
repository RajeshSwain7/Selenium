
public class CoreJavaBrushUp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to create a method  and access methods using java class object
		
		// to access the method 1st we have to create a object, then only we can access the method.
		CoreJavaBrushUp4 d = new CoreJavaBrushUp4();
		String name= d.getData(); // store the return value
		System.out.println(name);// capture the return value
		
		System.out.println("==========================");
		// Accessing MethodDemo2 here which is there in different file
		// so 1st create object and store and then access it
		MethodDemo2 dd= new MethodDemo2();
		String td=dd.getUserData();
		System.out.println(td);
		
		System.out.println("==========================");
		// Without accessing without object
		String nameone= getDataOne();
		
	}
	public String getData() {
		System.out.println("Hello World");
		return "Rajesh";
	}
	
	//How to access my method without creating an object.
	// For that the method should be declared with static
	public static String getDataOne() {
		System.out.println("Hello Misleen");
		return "Misleen";
	}

}
