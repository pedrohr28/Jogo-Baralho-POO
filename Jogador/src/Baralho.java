import java.util.Random;
public class Baralho 
{
    private Carta[] cartas;
    Random gerador= new Random();
    public Baralho()
    {
        int posicao=0;
        cartas = new Carta[52];
        //preencher os valores e naipes cartas
        for(int k=0;k<4;k++)
        {
            for(int p=0;p<13;p++)
            {
                if(k==0)
                {    
                    cartas[posicao]=new Carta();
                    cartas[posicao].setValor(p+1);
                    cartas[posicao].setNaipe("Copas");
                }
                if(k==1)
                {
                    cartas[posicao]=new Carta();
                    cartas[posicao].setValor(p+1);
                    cartas[posicao].setNaipe("Espadas");
                }
                if(k==2)
                {
                    cartas[posicao]=new Carta();
                    cartas[posicao].setValor(p+1);
                    cartas[posicao].setNaipe("Ouro");
                }
                if(k==3)
                {
                    cartas[posicao]=new Carta();
                    cartas[posicao].setValor(p+1);
                    cartas[posicao].setNaipe("Paus");
                }
                posicao++;
            }   
        }
        
    }
   
    public void Embaralhar()
    {
        Carta aux=new Carta(); 
        int pos_aleatoria;
        for(int j=0; j<52 ;j++)
          {
              pos_aleatoria=gerador.nextInt(52);
              if((j!=pos_aleatoria)&&(!cartas[j].getNaipe().equals(cartas[pos_aleatoria].getNaipe())))
              {
                 aux=cartas[j];
                cartas[j]=cartas[pos_aleatoria];
                cartas[pos_aleatoria]=aux;
              }
          }
        
    }
    public Carta getCartas(int posicao)
    {
       return cartas[posicao];
    }
    
}