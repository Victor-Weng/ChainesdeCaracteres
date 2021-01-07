import java.util.Scanner;
/*
* Author : Victor
* Date : Jan 7, 2021
* Description : Une code qui verifie si la text est 'happy','sad','unsure', ou 'none' en
* determinant la quantite des visages ":-)" et ":-(" presente dans la texte
*/
public class Ex2
	{

		public static void main(String[] args)
			{
				// Declare la variable 'mood' pour conclure une emotion 
				// Declare la variable 'track' pour verifier la presence des visages
				int mood = 0;
				int track = 0;
				
				// Scanner, on prend une ligne de texte comme input
				Scanner sc=new Scanner(System.in);	
				String text = sc.nextLine();
				// On converte le string en array pour qu'on puisse verifier les caracteres
				char[] array=text.toCharArray();
				
				// On loop le verification en termes de nombres des caracteres dans la string 
				// On - 2 car il n'est pas possible d'avoir une visage complete avec seulement 2 caracteres
				// Et donc, on evite une erreur avec une array vide
				for (int i = 0; i < text.length()-2; i++)
				{
					
					// On assigne les characteres au variables temporelles
					char temp = array[i];
					char temp2 = array[i+1];
					char temp3 = array[i+2];
					
					
					// On verifie la visage
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
		
		// On affiche les reponses
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
