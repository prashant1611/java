
public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {9,45,234,89,23,6,78};
		 int minItem = min(arr);
		 System.out.println(minItem);
		 //this program is valid for positive number
		 		 
	}
	public static int min(int[]arr) {
		int min = Integer.MAX_VALUE;
		 for(int i =0;i<arr.length;i++) {
			 
			 if(min>arr[i]) {
				 
				 min=arr[i];
			 }
		 }
		 return min;
	}

}
