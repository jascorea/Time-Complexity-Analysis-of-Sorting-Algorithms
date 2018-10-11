
public class InsertionSort
{
	public static void insertionSort(int numbers[], int numbersSize)
	{
		int i,j,temp;
				for(i=1;i<numbersSize;i++)
		{
			j=i;
			while(j>0 && numbers[j]<numbers[j-1])
			{
				temp=numbers[j];
				numbers[j]=numbers[j-1];
				numbers[j-1]=temp;
				j--;
			}
		}
	}

public static void main(String [] args)
{
	int numbers[]={10,2,78,4,45,32,7,11};
	final int NUMBERS_SIZE=8;
	int i;
	System.out.print("unsorted ");
	for(i=0;i<NUMBERS_SIZE;i++)
	{
		System.out.print(numbers[i]+" ");
	}
	System.out.println();
	
	insertionSort(numbers, NUMBERS_SIZE);
	 System.out.print("Sorted ");
	 
	 for(i=0; i<NUMBERS_SIZE;i++)
	 {
		 System.out.print(numbers[i]+" ");
	 }
	 
}
}
