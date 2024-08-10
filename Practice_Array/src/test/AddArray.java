/* break array into array and reverse both array and add both array
 * Ex :{1,2,3,4,5,6,7,8,9,10} => {5,4,3,2,1} and {10,9,8,7,6}
 * 		{5,4,3,2,1,10,9,8,7,6} :{(1+10),(2+9),(3+8),(4+7),(5+6)} =>{11,11,11,11,11} 	
 */
package test;

public class AddArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int[] a1= new int[arr.length];			//a1={5,4,3,2,1,10,9,8,7,6}
		int[] r1= new int[arr.length/2];
		int[] r2= new int[arr.length/2];
		int[] r3= new int[arr.length/2];
		int[] result=new int[arr.length/2];
		int index=0,index1=0,index2=0,index3=0,indexRes=0;
		
		//r1={5,4,3,2,1}
		for(int i=arr.length/2-1;i>=0;i--) {
			a1[index]=arr[i];
			r1[index1]=arr[i];
			index++;
			index1++;
		}
		//r2={10,9,8,7,6}
		for(int i=arr.length-1;i>arr.length/2-1;i--) {
			a1[index]=arr[i];
			r2[index2]=arr[i];
			index++;
			index2++;
		}
		//r3={6,7,8,9,10}
		for(int i=arr.length/2;i<arr.length;i++) {
			r3[index3]=arr[i];
			index3++;
		}
		
		//result={11,11,11,11,11}
		for(int i=0;i<arr.length/2;i++) {
			int n1=0;
			int n2=0;
			
			n1=r1[i];
			n2=r3[i];
			result[indexRes]=n1+n2;
			indexRes++;
		}
		
		for(int res : a1) {
			System.out.print(res+" ");
		}
		
	}

}
