package patterns;

public class LeftTriangle {

	public static void left(int n)
	{
		for (int j=0; j<n; j++)
		{
			for (int i=0;i<2*(n-j);i++)
				System.out.print(" ");
			for (int i=0;i<=j;i++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		left(n);
	}

}
