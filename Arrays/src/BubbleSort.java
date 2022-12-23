import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[6];
		System.out.println("enter 6 number :");
		for(int i = 0;i<arr.length;i++) {
			System.out.println("enter number"+i);
			arr[i]=sc.nextInt();
		}
		bubble(arr);
		System.out.println("array after sorting");
		System.out.println(Arrays.toString(arr));
		
	}
    public static void bubble(int []arr) {
    	 
    	for(int i =0;i<arr.length;i++) {
    		for(int j=1;j<arr.length-i;j++) {
    			
    			if(arr[j]<arr[j-1]) {
    				int temp = arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1]=temp;
    			}
    		}
    	}
    }
}
