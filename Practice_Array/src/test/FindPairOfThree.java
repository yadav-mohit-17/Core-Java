package test;

public class FindPairOfThree {

	public static void main(String[] args) {
		int[] a= {4,6,3,5,8,2};
		int sum=13;
		System.out.println("Given Pairs Are The Pairs Whose Sum is :"+sum);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.print("{"+a[i]+","+a[j]+","+a[k]+"}"+" ");
					}
				}
			}
		}
	}
}
