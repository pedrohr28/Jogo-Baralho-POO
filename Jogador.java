
public class Jogador
{
    private Baralho baralho;
    private Cartas[] cartas;
    Cartas ordena_cartas;
    public Baralho(int tamanho)
    {
    	baralho = new Baralho();
    	cartas = new Cartas[tamanho];
    	ordena_cartas= new Cartas();
    }

    public int Maior_carta(int tamanho)
    {
    	for(int k=0; i<tamanho ;i++)
    	{
    		cartas[i]=baralho[i][i];
    	}
    	for(int i=0;i<tamanho-1;i++)
    	{
    		for(int j=i;j<tamanho;j++)
    		{
    			if(cartas[i]>cartas[j])
    			{
    				ordena_cartas=cartas[j];
    				cartas[j]=cartas[i];
    				cartas[i]=ordena_cartas;
    			}
    		}
    	}
    	return cartas[tamanho-1];
    }

}
