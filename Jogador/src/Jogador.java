
public class Jogador
{
    private Carta[] cartas;
    public Jogador(int tamanho)
    {
    	cartas = new Carta[tamanho];
        for(int i=0;i<tamanho;i++)
        {
            cartas[i]=new Carta();
        }
        
    }
    public void setCarta(int pos,Carta cartas)
    {
        this.cartas[pos]=cartas;
    }
    public Carta getCarta(int pos)
    {
        return this.cartas[pos];
    }
    //Oderna as cartas em ordem crescente
    public Carta Maior_carta(int tamanho)
    {
    	Carta ordena_cartas;

        for(int i=0;i<tamanho-1;i++)
    	{
    		for(int j=i+1;j<tamanho;j++)
    		{
    			if(cartas[i].getValor()>cartas[j].getValor())
                        { 
    				ordena_cartas=cartas[j];
    				cartas[j]=cartas[i];
    				cartas[i]=ordena_cartas;
    			}
    		}
    	}
        //maior carta
    	return cartas[tamanho-1];
    }

}
