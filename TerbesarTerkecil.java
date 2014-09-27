import java.util.Scanner;
public class TerbesarTerkecil
{
	public static void main(String[] args)
	{
		//array dari 10 bilangan
		int numbers[] = new int[10];
		int smallest = numbers[0];
		
		Scanner scan=new Scanner(System.in);
		for(int x=0;x<10;x++)
		{
			System.out.print("Masukan nilai ke-"+(x+1)+" : ");
			numbers[x]=scan.nextInt();
		}
		for(int x=0;x<10;x++)
		{
			if(numbers[x] > largetst)
				largetst = numbers[x];
			else if (numbers[x] < smallest)
				smallest = numbers[x];
		}
		