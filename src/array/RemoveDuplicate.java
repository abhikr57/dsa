package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	/*
	 * In place 
	 * Need to return of length after removing duplicate
	 * Time complexity O(N+N)
	 * space complexity O(n)
	 */
	public static void removeDuplicateV1(int arr[]) {
//		Set<Integer> set= new HashSet<>();
//		for(int i:arr) {
//			set.add(i);
//		}
//		System.out.println(set);
//		int j=0;
//		for(int i:set) {
//			arr[j]=i;
//			System.out.println(j);
//			j++;
//		}
//		
//	System.out.println(j);
	}
	
	/*
	 * approach 2 optimal
	 * two pointer appraoch
	 * Time complexity O(n)
	 * space complexity O(1)
	 * 
	 */
	public static int removeDuplicate2(int []arr) {
		
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				
				i++;
				System.out.println(i);
			}
		}
		
		//length of modified array
		return i+1;
		
		
	}

	public static void main(String[] args) {
		
		int arr []= {0,0,1,1,1,2,2,3,3,4};
		removeDuplicateV1(arr);
		System.out.println(removeDuplicate2(arr));
		

	}

}
