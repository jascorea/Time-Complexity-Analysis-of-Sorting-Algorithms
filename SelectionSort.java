
public class SelectionSort {
	public static void selectionSort(int numbers[], int numbersSize)
	{
		int i,j,indexSmallest;
		int temp;
		for(i=0;i<numbersSize;i++)
		{
			indexSmallest=i;
			for(j=i+1;j<numbersSize;j++)
			{
				if(numbers[j]<numbers[indexSmallest])
				{
					indexSmallest=j;
				}
			}
			temp=numbers[i];
			numbers[i]=numbers[indexSmallest];
			numbers[indexSmallest]=temp;
		}
	}
public static void main(String [] args)
{
	int numbers[]={4,3,67,89,23,56,65,12};
	final int NUMBERS_SIZE=8;
	int i;
	System.out.print("Unsorted ");
	
	for(i=0;i<NUMBERS_SIZE;i++)
	{
		System.out.print(numbers[i]+" ");
	}
	System.out.println();
	
	selectionSort(numbers,NUMBERS_SIZE);
	
	System.out.print("Sorted");
	for(i=0;i<NUMBERS_SIZE;i++)
	{
		System.out.print(numbers[i]+" ");
	}
}
}
