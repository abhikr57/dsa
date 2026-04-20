package array;

import java.util.Arrays;

public class SecondLargestInArray {
	
	//approach 1 Brute force
	//using sorting technique
	//Time complexity O(nlogn+n)
	//space complexity O(1)
	public static int secondLargestElementV1(int []arr) {
		
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=arr.length-2;i>=0;i--) {
			if(largest!=arr[i]) {
				secondLargest=arr[i];
				break;
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargest;
			
	}
	
	/* better
	 * approach 2 using two pass to find second largest
	 * Time complexity O(N+N)=2N
	 * space O(1)
	 */
	public static int secondLargestElementV2(int []arr) {
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE)
			return -1;
		return secondLargest;
	}
	
	/*optimal solution
	 * 
	 */
	
	public static int secondLargestElementV3(int []arr) {
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE)
			return -1;
		return secondLargest;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,2,2,2,2,2};
		//we are assuming size is greater than 2 always
		System.out.println(secondLargestElementV1(arr));
		System.out.println(secondLargestElementV2(arr));
		System.out.println(secondLargestElementV3(arr));

	}

}
