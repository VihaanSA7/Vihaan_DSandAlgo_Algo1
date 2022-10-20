package lab2Q2;

import java.util.Scanner;
public class CurrencyDenomCalcu 
{
	public static void countCurrency(int amount, int[] notes ,int size)
    {
        int[] noteCounter = new int[size];

        for (int i = 0; i < size; i++) 
        {
            if (amount >= notes[i]) 
            {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
      
        System.out.println("Currency Count ->");
        for (int i = 0; i < size; i++) 
        {
            if (noteCounter[i] != 0) 
            {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }

	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominations");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Currency Denomination values");
		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("Enter the Amount to be paid");
		int amount = s.nextInt();

		int temp=0;
		for (int i = 0; i < arr.length; i++) 
		{     
            for (int j = i+1; j < arr.length; j++) 
            {     
               if(arr[i] < arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
        countCurrency(amount, arr , size);

	}

}
