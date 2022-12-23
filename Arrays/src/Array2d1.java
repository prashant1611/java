import java.util.Scanner;
public class Array2d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[2][];
		Scanner sc = new Scanner(System.in);
		arr[0]=new int[3];
		arr[1]= new int [2];
		
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
