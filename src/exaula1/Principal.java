package exaula1;

import javax.swing.JOptionPane;

public class Principal 
{
	public static void main (String[] Args) 
	{
		int opcao;
		int resultSoma;
		int tamanho = 0;
		int fat;
		int num;
		
		MetRecursivos met = new MetRecursivos();
		
		opcao= Integer.parseInt(JOptionPane.showInputDialog(" Menu \n Escolha uma opção \n 1 - Somatória \n 2- Menor valor vetor \n 3- Fatorial \n 4- Qtde de negativos no vetor \n 5- Somatória de Frações"));
		
		switch (opcao) 
		{
			case 1:
				resultSoma= met.somaNumeros(Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a somatória")));
				System.out.println(resultSoma);
				break;
				
			case 2:
				tamanho= Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
				int[] vet = new int[tamanho];
				
				for (int i=0; i<tamanho; i++) 
				{
					vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para armazenar no vetor"));
				}
				System.out.println(met.menorValorVet(vet, tamanho));

				break;
				
			case 3:
				fat = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcular o fatorial"));
				System.out.println(met.fatorial(fat));
				break;
				
			case 4:
				tamanho= Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
				int[] vet1 = new int[tamanho];
				
				for (int i=0; i<tamanho; i++) 
				{
					vet1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para armazenar no vetor"));
				}
				System.out.println(met.qtdeNegativosVet(vet1, tamanho));

				break;
				
			case 5:
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser o último denominador da somatória"));
				System.out.println(met.somaFracao(num));
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;

		
		}
	}
	
	
}
