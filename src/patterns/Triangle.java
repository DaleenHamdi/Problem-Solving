package patterns;

public class Triangle {

	public static void triangleStars(int n)
	{
		for(int j=0;j<n;j++)
		{
		for(int i=n-j;i>=0;i--) 
		{
			System.out.print(" ");
		}
		for (int i=0;i<=j;i++)
		{	System.out.print("* ");
		}
		System.out.println("");
		}

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		triangleStars(n);
	}

}
