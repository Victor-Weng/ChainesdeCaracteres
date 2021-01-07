import java.util.Scanner;
/*
* Author : Victor
* Date : Jan 7, 2021
* Description : 
*/
public class Ex2
	{

		public static void main(String[] args)
			{
				int mood = 0;
				int track = 0;
				
				Scanner sc=new Scanner(System.in);	
				String text = sc.nextLine();
				char[] array=text.toCharArray();
				
				for (int i = 0; i < text.length(); i++)
				{
					char temp = array[i];
					char temp2 = array[i+1];
					char temp3 = array[i+2];
							
					if(temp == ':')
					{
						if(temp2 == '-')
						{
							if(temp3 == ')')
							{
								mood++;
								track++;	
							}
							else if(temp3 == '(')
							{
								mood--;
								track++;
							}
						}
					}

				}
		
		if(track==0)
		{
			System.out.println("none");
		}
		else if(mood==0)
		{
			System.out.println("unsure");
		}
		else if(mood>0)
		{
			System.out.println("happy");
		}
		else if(mood<0)
		{
			System.out.println("sad");
		}
				
				
			
				
		sc.close();

		}
	}
