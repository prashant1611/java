
public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {4,30,70,45,78,90};
		int max = 0;
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
