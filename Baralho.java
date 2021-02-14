import java.util.Random;
public class Baralho 
{
    private Carta[][] cartas;
    Random gerador= new Random();
    public Baralho()
    {
        cartas = new Carta[4][13];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<13;j++)
            {
                if(i==0)
                {    
                    cartas[i][j].setValor(j+1);
                    cartas[i][j].setNaipe("Copas");
                }
                if(i==1)
                {
                    cartas[i][j].setValor(j+1);
                    cartas[i][j].setNaipe("Espadas");
                }
                if(i==2)
                {
                    cartas[i][j].setValor(j+1);
                    cartas[i][j].setNaipe("Ouro");
                }
                if(i==3)
                {
                    cartas[i][j].setValor(j+1);
                    cartas[i][j].setNaipe("Paus");
                }
            }
        }     
    }
    private void Embaralhar()
    {
        for(int i=0; i<4 ;i++)
        {
          for(int j=0; j<13 ;j++)
          {
            cartas[i][j]=cartas[gerador.nextInt(3)][gerador.nextInt(13)];
          }
        }
    }
    
    
}
