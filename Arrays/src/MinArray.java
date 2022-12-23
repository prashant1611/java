
public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {9,45,234,89,23,6,78};
		 
		 //this program is valid for positive number
		 int min = Integer.MAX_VALUE;
		 for(int i =0;i<arr.length;i++) {
			 
			 if(min>arr[i]) {
				 
				 min=arr[i];
			 }
		 }
		 System.out.println(min);
	}

}
