package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding intersection of array elements");
		int [] arr1 = {1,2,7,3,6,8};
		int [] arr2 = {7,2,8,4,9,1};
		
		for (int i = 0;i <arr1.length ; i ++)
		{
			for (int j = 0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
						{
					System.out.println(arr2[j]);
						}
			}
		}
	}

}
