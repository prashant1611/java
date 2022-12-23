import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [3][2];//array declaration
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("value for i ="+i+"and j="+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
