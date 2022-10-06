import java.io.*;

class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int creditScore = scanner.nextInt();
		
		if (creditScore >= 750) System.out.print("YES");
		else System.out.print("NO");
		
	}
}