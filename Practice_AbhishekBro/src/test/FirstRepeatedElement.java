package test;

public class FirstRepeatedElement {

	public static void main(String[] args) {
		int a[]= {10,45,67,3,2,45,6,45,67,67};
		boolean b=false; int temp=0;
		
		for(int i=0;i<a.length;i++) {			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b=true;
					temp=a[i];
				}
				break;
			}
			if(b==true) {
				System.out.print(a[i]+" ");
			}
		}
	//	System.out.println(temp);
	}
}
