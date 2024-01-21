import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2= {1,2,3,4,5,6,7,8,9,10,11};
		//print the value which is multiples by 2
		for(int i =0; i<arr2.length; i++) {
			if(arr2[i]%2 ==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+ " is not multiple of 2");
			}
		}
		System.out.println("==================================================");
		// check if array has multiple of 2
		for(int i =0; i<arr2.length; i++) {
			if(arr2[i]%2 ==0) {
				System.out.println(arr2[i]);
				break; // break keyword will stop the loop once the condition got satisfied.
			}
		}
		
		//What is Arrays list and difference between Arrays list and Arrays
		
		ArrayList<String> a = new ArrayList<String>();// import the array list package from utilities
		//create a object of the class- object.method
		// to access the methode we have to create the object
		a.add("Rohit");
		a.add("Rajnish");
		a.add("Manoj");
		a.add("Nihal");
		a.remove(2);
		System.out.println(a);
		System.out.println(a.get(2));
		
		
		//iterating over the arrays and array list and its related method
		for(int i=0;i<a.size(); i++){
			System.out.println(a.get(i)); // this is normal for loop
		}
		// for enhanced for loop
		System.out.println("==============================");
		for(String val :a){
			System.out.println(val);
		
		}
		
		// item is present in array list
		System.out.println(a.contains("Selenium"));
		
		//Convert the normal array list to arrayslist dynamically
		String[] ar = {"Rajesh","Babulu","slenium", "Apu"};
		List<String> arArrayList = Arrays.asList(ar);
		System.out.println(arArrayList);
		System.out.println(a.contains("Selenium"));	
		
	}
}
