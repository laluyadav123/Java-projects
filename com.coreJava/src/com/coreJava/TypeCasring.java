package com.coreJava;

public class TypeCasring {

	public static void main(String[] args) {
		/*//two dimention array
		 * int arr1[][] = { { 1, 2, 3 }, { 2, 3, 4 } }; int arr2[][] = { { 1, 2, 3 }, {
		 * 2, 3, 4 } };
		 * 
		 * int c[][]= new int[2][2]; for (int i = 0; i < 2; i++) {
		 * 
		 * for (int j = 0; j < 2; j++) { c[i][j] = 0;
		 * 
		 * c[i][j]+= arr1[i][j] * arr2[i][j];
		 * 
		 * System.out.print(c[i][j]+" "); } System.out.println(); }
		 */
//three dimention array
		//int arr1[][][] = {{ { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 }}, {{ 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } }};
		
		//System.out.println(arr1[0][2][0]);

		//enhance for loop
		int j=0;
		
		int arr[] = {1,2,3,4,5,6,7};
		
		for(int i:arr) {
			arr[j]=i+10;
			j++;
			System.out.println(i+10);
		}
;	}
}
