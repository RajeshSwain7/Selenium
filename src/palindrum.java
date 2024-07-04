
public class palindrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234321;
		int rev=0;
		int temp = num;
		
		while (num >0) {
			int rem =num%10;
			
			rev= rev*10+rem;
			
			num =num/10;
			
		}
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println(rev +" is a Pelindrum");
		}
		else {
			System.out.println(rev+ " is Not a Pelindrum");
		}
		

	}

}
