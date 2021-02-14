import java.util.Scanner;
public class Mesa
{
    public static void main(String[] args)
    {
        Baralho baralho=new Baralho();
        Carta[] cartas= new Carta[2];
        Carta auxiliar = new Carta();
        Jogador[] jogadores=new Jogador[2];
        Scanner input= new Scanner(System.in);
        int quantidade_cartas;
        boolean controle=true;
        while(controle)
        {
            System.out.println("Digite a quantidade quartas:");
            quantidade_cartas=input.nextInt();
            System.out.println("Mesa embaralhando");
            baralho.Embaralhar();
            for(int j=0;j<2;j++)
            {
              jogadores[j] = new Jogador(quantidade_cartas);
              cartas[j] = new Carta();
            }
            System.out.println("Mesa distribui as 5 cartas para jogador A e para o jogador B:");
            for(int i=0;i<quantidade_cartas ; i++)
            {
                //Jogador A
                jogadores[0].setCarta(i,baralho.getCartas(i));
                //Jogador B
                jogadores[1].setCarta(i,baralho.getCartas(51-i));
            }
            //carta maior jogador a
            cartas[0]=jogadores[0].Maior_carta(quantidade_cartas);
            //carta maior jogador b
            cartas[1]=jogadores[1].Maior_carta(quantidade_cartas);
            System.out.println("O jogador A joga a carta de naipe " + cartas[0].getNaipe()+" e de valor "+ cartas[0].getValor());
            cartas[1]=jogadores[1].Maior_carta(quantidade_cartas);
            System.out.println("O jogador B joga a carta de naipe " + cartas[1].getNaipe()+" e de valor "+ cartas[1].getValor());
            if(cartas[0].getValor()>cartas[1].getValor())
            {
                System.out.println("O jogador A venceu:");
                controle=false;
            }
            if(cartas[0].getValor()<cartas[1].getValor())
            {
                System.out.println("O Jogador B venceu:");
                controle=false;
            }
            if(cartas[0].getValor()==cartas[1].getValor())
            {
                int i,j,ouro=0;
                //Olhando nas cartas sem tem carta de Ouro
                 for( i=0;i<quantidade_cartas;i++)
                 {
                 		if(jogadores[0].getCarta(i).getNaipe().equals("Ouro"))                 		
                 		{
                 			for( j=0;j<quantidade_cartas;j++)
                 			{
                 				if(jogadores[1].getCarta(j).getNaipe().equals("Ouro"))
                 				{
                 					System.out.println("Como os valores das cartas são iguais e os dois jogadores tem carta de Ouros, jogo ficou empatado!");	
                 					i=quantidade_cartas+1;	
                 				}
                 			}
                 			if(j==quantidade_cartas)
                 			{
                 				System.out.println("Jogador A venceu:");
                 				i=quantidade_cartas+1;
                                controle=false;
                 			}
                 		}
                 		else
                 		{
                            //Jogador B tem carta de Ouro
                 			if(jogadores[1].getCarta(i).getNaipe().equals("Ouro"))
                 			{
                 				ouro++;
                 			}
                 		}
                 	}
                    //nao tem carta de ouro em nenhum dos dois jogadores
                 	if(ouro==0&&i==quantidade_cartas)
                 	{
                 		System.out.println("Como os valores das cartas são iguais e nenhum dos dois jogadores tem carta de Ouros, jogo ficou empatado!");
                 	}
                    //tem carta de ouro em somente jogador B
                 	if(ouro!=0&&i==quantidade_cartas)
                 	{
                 		System.out.println("Jogador B venceu");
                                controle=false;
                 	}
                  }	           
            }
        
        }
    
    }
