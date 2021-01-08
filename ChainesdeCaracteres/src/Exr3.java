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
				String [] y= new String [L];
				
				
				for (int i = 0; i < L; i++) 
				{
					y[i]=sc.nextLine();
								
				}
								
				for (int i = 0; i < L; i++) 
				{
					String[] t=y[i].split(" ");
					for (int j = 0; j <Integer.parseInt(t[0]); j++) 
					{
													
						System.out.print(t[1]);
						
						
					}
					System.out.println("");
					
					
				}
				sc.close();
			}

	}
