package coreJava;

import java.util.Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		int b[][]= {{2,3,4},{5,6,7}};
		
		//System.out.println(b[1][1]);
		System.out.println(Arrays.deepToString(a));
		
		for(int k=0; k<2;k++)
		{
			for(int l = 0; l<3;l++)
			{
				System.out.print(a[k][l]+"\t");
			}
			System.out.println();
		}

	}

}
