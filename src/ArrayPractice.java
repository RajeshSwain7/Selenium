
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0]= 5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		
//		for(int i=0; i<=4; i++) {
//			System.out.println(a[i]);
//		}
		for(int i:a) {
			System.out.println(i);
		}
		String s[] = new String[3];
		s[0]="Welcome";
		s[1]="to";
		s[2]="Array Training";
		
		for(String i:s) {
			System.out.println(i);
		}
	}

}
