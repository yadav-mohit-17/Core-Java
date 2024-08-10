// program to display the pair of 2 element which sum is 7

package test;

public class FindPairOfTwo {
	public static void main(String[] args) {
		int []a= {4,6,3,5,8,2};
		int sum=7;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j] ==sum) {
					System.out.print("{"+a[i]+","+a[j]+"}");
				}
			}
		}
	
	}

}
