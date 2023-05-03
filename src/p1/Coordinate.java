package p1;

import java.util.Scanner;

public class Coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt() ;
		char c='R';
		int x=0,y=0;
		int dist=10;
		while(n>0) {
			switch(c) {
			case 'R':
				x = x+dist;
				dist=dist+10;
				c='U';
				break;
				
			case 'U':
				y=y+dist;
				dist=dist+10;
				c='L';
				break;
				
			case 'L':
				x=x-dist;
				dist=dist+10;
				c='D';
				break;
				
			case 'D':
				y=y-dist;
				dist=dist+10;
				c='A';
				break;
				
			case 'A':
				x=x+dist;
				dist=dist+10;
				c='R';
				break;
				
			}
			n--;
		}
		System.out.println(x+" ,"+y);
		
		

	}

}
