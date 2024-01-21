
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data type & variable
		
		int myNum=6;
		String webSite="Rajesh";
		char latter ='r';
		double dec = 5.88;
		boolean myCard=true;
		System.out.println(myNum);
		System.out.println(webSite);
		System.out.println(latter);
		System.out.println(dec);
		System.out.println(myCard);
		System.out.println(myNum+"is the value stored in myNum variable");
		
		//Arrays- It can store multiple values in one variable
		
		//Array declaration
		//1st declar the size then assign
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//another way to initialize arr
		//while declaring the array initialize the value
		int[] aar2= {1,2,3,4,5,4,4,5,3,6,8,4,2,6,3,10};
		// how to access the arr value
		System.out.println(arr[2]);		
		System.out.println(aar2[3]);	
		// remember every time array always starts from 0, in memory it store from 0.
		//loop to iterate the array of string and integer
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<aar2.length; i++){
			System.out.println(aar2[i]);
		}
		
		
		// string array.
		
		String[] ar = {"Rajesh","Babulu","slenium", "Apu"};
		
		for(int i=0;i<ar.length; i++){
			System.out.println(ar[i]);
			if (ar[i]=="Rajesh")
				{
				System.out.println("Hye!! Rajesh I Found you.");		
			}
			else {
				System.out.println("Sorry!! i can't found you");
			}
		}
		
		
		// Enhanced for loop declaration & using conditional statements inside the loop
		
		for(String s: ar){
			System.out.println(s);
		}	
		
	}

}
