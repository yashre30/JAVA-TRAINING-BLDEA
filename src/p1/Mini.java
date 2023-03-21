package p1;
import java.util.Scanner;
public class Mini{
	static int minDist (int arr[],int n, int x,int y) {
					int dist=Integer.MAX_VALUE;
					for(int i=0;i<n;i++) {
						for(int j=i+1;j<n;j++) {
							if((x==arr[i] && y==arr[j] || y==arr[i] && x==arr[j])&& dist>Math.abs(i-j)) 
								dist=Math.abs(i-j);
						}
								
							}
						if(dist > n) {
							return -1;
						}
						
					return dist;
					}
				
				public static void main(String[] args) {
					Mini min=new Mini();
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the value for x and y:");
					
					int x=sc.nextInt();
					int y=sc.nextInt();
					int[] arr= {1,2,3,4,4,5,6,7};
					int n=arr.length;
				
					System.out.println("minimum distance between" + x + "and " + y + "is " + min.minDist(arr,n,x,y));


		}
				


	}


