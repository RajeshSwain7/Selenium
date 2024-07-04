
public class evenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =52231455;
		int evenCount =0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				evenCount++;
			}
			num =num/10;
		}
		System.out.println("evnenCount= "+ evenCount);
		

	}

}
