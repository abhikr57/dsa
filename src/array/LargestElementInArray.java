package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
	
	//approach 1 using sort Time Complexity n(logn)
	//space O
	public static int largestElementInArray(int []arr) {
		
		int largest;
		Arrays.sort(arr);
		largest=arr[arr.length-1];
		return largest;
		
	}
	
	//approach 2 using traverse technique
	//Time Complexity O(n)
	//Space Complexity 1
	public static int largestElemetInArrayV2(int []arr) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<=arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int size;
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(largestElementInArray(arr));
		System.out.println(largestElemetInArrayV2(arr));
		

	}

}
