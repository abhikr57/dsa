package array;

public class LeftRotateByOne {
	
	/*
	 * Time Complexity O(n)
	 * Space Complexity O(1)
	 */
	
	public static void leftRotationByOne(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		leftRotationByOne(arr);
		

	}

}
