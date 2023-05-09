package org.arrayconcept;

public class ArrayConcepts {
	
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 10;
		
		
		System.out.println(a[4]);
		
//		int b[] = {50,55,60,65,70};
//		
//		System.out.println(b[3]);
//		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
//		
//		
//		for (int j : a) {
//			System.out.println(j);
//		}
	}

}
