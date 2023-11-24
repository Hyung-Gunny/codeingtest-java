package codingtestdp1;

import java.util.Scanner;



public class mian {
	
	static int d[];
	static public void main(String[] args) throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int n= scanner.nextInt();
		
		d =new int[n+1];
		d[1]=0;
		
		for(int i=2; i<n+1; i++)
		{
			d[i]=d[i-1]+1;
			
			if(i%2==0 && d[i]>d[i/2]+1)
			{
				d[i]=d[i/2]+1;
			}
			if(i%3==0 && d[i]>d[i/3]+1)
			{
				d[i]=d[i/3]+1;
			}
		}
		System.out.println(d[n]);
		
	}

}
