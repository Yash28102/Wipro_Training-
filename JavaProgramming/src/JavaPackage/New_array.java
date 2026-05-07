package JavaPackage;
import java.util.Scanner;
public class New_array {

	public static void main(String[] args) {
		//int[][] a=new int[5][5];
		
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j]=j+1;
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int[] a= new int[n];
		a[0]=1;
		System.out.print(a[0]+" ");
		a[1]=1;
		System.out.print(a[0]+" ");
		for(int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
			System.out.print(a[i]+" ");
		}
		
		
		

	}

}
