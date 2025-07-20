package coreJava;

public class InterviewMaxNumber {
/*	
	2	4	5
	5	6	7
	1	9	4 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int b[][]= {{2,3,4},{5,6,7},{1,9,-4}};
		int u = b[0][0];
		
		for(int k=0; k<3;k++)
		{
			for(int l = 0; l<3;l++)
			{
				if(b[k][l]>u)
				{
					u=b[k][l];
				}
			}
			
		}
		System.out.println("Maximum number : "+ u);
		
		
	}

}
