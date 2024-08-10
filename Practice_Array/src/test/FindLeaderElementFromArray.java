// Leader Elements = element which is greater then N/2.
// In this array leader element is :7 

package test;

import java.util.Arrays;

public class FindLeaderElementFromArray {
	public static void main(String[] args) {
		int[] arr= {1,6,6,5,7,4,1,7,7,7,7,7,7,7,2};
		int leader = arr.length/2;  //7
		int count=1;
		Arrays.sort(arr); //{1,1,2,4,5,6,6,7,7,7,7,7}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				else {
					break;
				}
			}
		}
		if(count > leader) {
			System.out.println(count);
		}
	}

}
