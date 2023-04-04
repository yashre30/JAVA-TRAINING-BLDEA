package p1;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the length of the array:");
				int n=sc.nextInt();
				
				//syntax of array
				int[] arr=new int[n];
				System.out.println("enter the array elements:");
				
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				
				//main
				int i=0;
				int j=n-1;
				
				System.out.println("the reverse array is:");

				while(i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					i++;
					j--;
					
					
				}
				for(int k=0;k<n;k++) {
					System.out.println(arr[k]+" ");
				}

			}

		}
