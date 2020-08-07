import java.util.*;
public class GenerateSeries{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the fno:");
		int a=s.nextInt();
		System.out.println("Enter the sno:");
		int b=s.nextInt();
		System.out.println("Enter the tno:");
		int c=s.nextInt();
		System.out.println("Enter the N value:");
		int N=s.nextInt();
		int n1=b-a;
		int n2=c-b;
		int out=a;
		for(int i=1;i<N;i++)
		{
			if(i%2==0)
			{
				out=out+n1;
			}
			else
			{
				out=out+n2;
			}
		}
		return out;
	}
}