package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if( i != arr[i-1]) {
				System.out.println(i);
				break;
		}

	
}
	}

	}


