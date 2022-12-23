import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [7];
		for(int i =0;i<arr.length;i++) {
			System.out.println("enter the number "+i);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
