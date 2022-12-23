import java.util.Scanner;
public class Array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][][] ar=new int [2][2][3];
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i=0;i<ar.length;i++) {
			 for(int j=0;j<ar[i].length;j++) {
				 for(int k=0;k<ar[i][j].length;k++) {
					 
					 System.out.println("array position i="+i+"j="+j+"k="+k);
					 ar[i][j][k]=sc.nextInt();
				 }
			 }
		 }
		 
		 for(int i=0;i<ar.length;i++) {
			 for(int j=0;j<ar[i].length;j++) {
				 for(int k=0;k<ar[i][j].length;k++) {
					 
					 System.out.println("arr[" + i+ "]["+ j + "]["+ k + "] = "+ ar[i][j][k]);
					 
				 }
			 }
		 }
		 
	}

}
