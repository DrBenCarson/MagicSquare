
import java.util.Scanner;
public class Tester {


	public static void main(String[] args) {
		int magicSquare[][]=new int[4][4];
		
		for(int a=0;a<4;a++)
		{
			System.out.println("Please enter four integers:");	
			for(int b=0;b<4;b++)
			{
			
			Scanner intTake=new Scanner(System.in);
			magicSquare[a][b]=intTake.nextInt();
			}
		}
		MagiCCheck hh=new MagiCCheck(magicSqaure[][]);
		//i have no idea what is wrong. I feel like it's right...
		System.out.println(hh.magicChecker(magicSquare));
		for(int c=0;c<4;c++)
		{
			for(int d=0;d<4;d++)
			{
			System.out.print(magicSquare[c][d]+"\t");
			}
			System.out.println();
		}
	}


}