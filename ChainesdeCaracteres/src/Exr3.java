import java.util.Scanner;
/*
* Author : Victor
* Date : Jan 7, 2021
* Description : 
*/
public class Exr3
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int	L = sc.nextInt(); 
				sc.nextLine();
				Object [][] y = new Object [L][1];
				
				
				for (int i = 0; i < L; i++) 
				{
					String z=sc.nextLine();
					y[i][0]= new String (z);
				
				}
				int k=0;
				
				for (int i = 0; i < L; i++) 
				{
					for (int j = 0; j <10; j++) 
					{
							
						a=y[i][0];
						System.out.println(y[i+2]);
						
					}
					
				}
				sc.close();
			}

	}
