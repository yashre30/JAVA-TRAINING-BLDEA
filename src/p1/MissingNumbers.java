package p1;

public class MissingNumbers {

	public static void main(String[] args) {
		
			int[] ar= {1,2,4,5};
			int n=ar.length+1;
			int sum=(n*(n+1))/2;
			for(int i=0;i<ar.length;i++) {
				sum=sum-ar[i];
				
			}
			System.out.println("missing number is" + sum);

	

	}

}
