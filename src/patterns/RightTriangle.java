package patterns;

public class RightTriangle {

	public static void right(int n)
	{
		for (int j=0;j<n;j++)
		{
			for (int i=0; i<=j;i++)
				System.out.print("* ");
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		right(n);
	}

}
