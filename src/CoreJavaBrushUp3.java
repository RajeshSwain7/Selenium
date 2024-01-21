
public class CoreJavaBrushUp3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings in Java & it's importance
		//String is an object which represent a sequence of object
		// Creation of string -1 (this method is know as string literal)
		// Here even though the string values are same it will not allocate new memory, else it will point out both the variable to same value in one single memory.
		String s4 = "Rajesh Selenium Practice";
		String s1 = "Rajesh Selenium Practice";
		// Creation of string -2 (this method is known as newString using new operator)
		// With new keyword even though the string value is same it will create a new memory allocation. Because of new Keyword.
		String s5 = new String("Welcome");
		String s3 = new String("Welcome");
		
		// break the string
		String s = "Rajesh Selenium Practice";
		s.split(" ");
		System.out.println(s);
		// Split method using looping
		String[] splittedString = s.split(" ");
		for(int i =0; i<splittedString.length;i++) {
		
			System.out.println(splittedString[i]);
		
			}
		System.out.println("==========================");
		String[] splitString = s.split("Selenium");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[1].trim());
	
	// print each character separate separated from the string
		System.out.println("==========================");
		for(int i =0; i<s.length();i++) {
			
			System.out.println(s.charAt(i));
		
			}
		System.out.println("==========================");
	// print the string in reverse order
		for(int i =s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));		
			}		
	}
}
