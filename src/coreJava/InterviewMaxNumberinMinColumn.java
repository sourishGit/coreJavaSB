package coreJava;

public class InterviewMaxNumberinMinColumn {
/*	
	2	4	5
	5	6	7
	1	9	4 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int b[][]= {{2,3,4},{-6,6,7},{1,9,-4}};
		int u = b[0][0];
		int minCol=0;
		
		for(int k=0; k<3;k++)
		{
			for(int l = 0; l<3;l++)
			{
				if(b[k][l]<u)
				{
					u=b[k][l];
					minCol= l;
					
				}
			}
			
		}
		System.out.println(minCol);
		System.out.println("Smallest number : "+ u);
		for(int i =0;i<3;i++)
		{
			if(b[i][minCol]>u)
			{
				u=b[i][minCol];
				
			}
		}
		System.out.println("Largest number : "+u);
		
		
	}

}
