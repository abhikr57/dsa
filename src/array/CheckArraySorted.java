package array;

public class CheckArraySorted {
	
	/*
	 * optimal approach
	 * Time complexity O(n)
	 * space Complexity O(1)
	 */
	
	public static boolean isSorted(int []arr) {
		boolean res=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				res=false;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		int arr []= {2,5,6,7,9,10};
		System.out.println(isSorted(arr));

	}

}
