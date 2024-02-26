package exaula1;

public class MetRecursivos 
{
	public int somaNumeros (int num) 
	{
		// A condição de parada é quando num == 0, para finslizsr se o decremento chegar ao final ou se alguém colocar um número negativo 
		if(num <= 0) {
			return 0;
		}
		
		// A relação de chamada dos passos se tratou de somar n + n-1, sendo n>0
		return num + somaNumeros(num-1);
	}
	
	
	static boolean compilado = false;
	static int menor = 0;
	public int menorValorVet (int[] vet1, int tamanho) 
	{	
		
		if (!compilado) {
			menor = vet1[tamanho - 1];
			compilado = true;
		}
		
		// A condição de parada é tamanho = 0. ou seja quando todos os indices do vetor já tiverem sido percorridos
		if (tamanho < 1) {
			return menor;
		}
		else if (vet1[tamanho - 1] < menor) 
		{
			menor = vet1[tamanho - 1]; 
		}
		// A relação de chamada dos passos se trata de diminuir a visibilidade dos itens do vetor, assim sempre comparo se o último valor do vetor é menor que o menor atual
		return menorValorVet(vet1, tamanho - 1);
	}
	
	public int fatorial(int num) 
	{
		// A condição de parada é numero <= 1. ou seja quando não houver mais valores para multiplicar
		if (num <= 1) 
		{
			return num;
		}
		// A relação de chamada dos passos se trata de multiplicar o numero por seu antecessor
		return num * fatorial(num-1);
	}
	
	static int negativos = 0;
	public int qtdeNegativosVet (int[] v1, int tam) 
	{
		// A condição de parada é tamanho = 0. ou seja quando todos os indices do vetor já tiverem sido percorridos
		if (tam < 1) {
			return negativos;
		}
		
		if (v1[tam - 1] < 0) 
		{
			negativos ++;
		}
		// A relação de chamada dos passos se trata de diminuir a visibilidade dos itens do vetor, assim sempre verifico se o último valor do vetor é negativo e em caso positivo contabilizo
		return qtdeNegativosVet(v1, tam - 1);
				
	}
	
	static double soma = 0;
	public double somaFracao(int n) 
	{
		// A condição de parada é n = 0, pois não é possivel dividir por zero, o menor denominador é 1
		if (n<1) 
		{
			return soma;
		}
		// A relação de chamada dos passos se trata de somar o valor de 1 / pelo n decrementado
		return (1 / (double) n) + somaFracao(n-1);
	}
}
