package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {17,21,22,23,15,14,28,16,17,19,28,23,20};
		
		System.out.println("Duplicate elements in given array");
		
		for (int i=0; i<arr.length; i++)
		{
			for ( int j = i+1; j<arr.length ; j++)
			{
				if( arr[i] == arr[j])
				{
				 
					System.out.println(arr[j]);
				}
	}
		}
	}
}
