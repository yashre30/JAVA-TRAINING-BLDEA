package p1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,4,5,6,7};
		int[] arr2= {2,3,5,7};
		int m=arr1.length;
		int n=arr2.length; 
		int i=0;
		int j=0;
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				i++;
			}
			else if(arr1[i] >arr2[j]) {
				j++;
			}
			else {
				System.out.print(arr2[j]+" ");
				j++;
				i++;
			}
		}

	}

}
