
public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Mahabharath";
		String rev ="";
		for (int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
		
}
		
		
//		 	String original = "Hello, world!";
//	        String reversed = reverseString(original);
//	        System.out.println("Original string: " + original);
//	        System.out.println("Reversed string: " + reversed);
//	    }
//	    
//	    public static String reverseString(String str) {
//	        StringBuilder reversed = new StringBuilder();
//	        for (int i = str.length() - 1; i >= 0; i--) {
//	            reversed.append(str.charAt(i));
//	        }
//	        return reversed.toString();
////	    }
//
//
//}
