import java.util.Scanner;
/*
* Author : Victor
* Date : Jan 6, 2021
* Description : Deux equipes : A (Apples) et B (Bananas) joue an basket. On doit determiner lequels
* des deux equipes ont gagne d'apres le nombre des tires de 3, 2 et 1.
*/
public class Ex1
	{
		public static void main(String[] args)
			{
				// Etablit les strings et le scanner
				Scanner sc=new Scanner(System.in);	
				int []aTab=new int[3];
				int []bTab=new int[3];
				
				// Input des tires A
				for (int i = 0; i < 3; i++)
				{
					aTab[i]=sc.nextInt();	
					// Verifier qu'il est entre 0 et 100
					if(aTab[i]>100||bTab[i]<0)
					{
						System.out.println("L'integre devrait etre entre 0 et 100");
						break;
					}
				}
				// Input des tires B
				for (int i = 0; i < 3; i++)
				{
					bTab[i]=sc.nextInt();
					// Verifier qu'il est entre 0 et 100
					if(bTab[i]>100||bTab[i]<0)
					{
						System.out.println("L'integre devrait etre entre 0 et 100");
						break;
					}
					
				}
				
				// Calculs
				int a3p = (aTab[0]*3);
				int a2p = (aTab[1]*2);
				int a1p = (aTab[2]*1);
				
				int b3p = (bTab[0]*3);
				int b2p = (bTab[1]*2);
				int b1p = (bTab[2]*1);
				
				// Totals
				int aTotal=a3p+a2p+a1p;
				int bTotal=b3p+b2p+b1p;
				
				// Afficher les resultats
				if(aTotal==bTotal)
				{
					System.out.println("T");
				}
				else if(aTotal>bTotal)
				{
					System.out.println("A");
				}
				else
				{
					System.out.println("B");
				}
				
				sc.close();
				
			}

		
	}
