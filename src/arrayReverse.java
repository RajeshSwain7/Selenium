
public class arrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {11,10,6,9,3};
		int count =0;
		int[] rev = new int[x.length];
		for (int i=x.length-1; i>=0; i--) {
			rev[count++]=x[i];
		}
		for (int i = 0; i < rev.length; i++) {
		System.out.println(rev[i]);
		}

	}

}
