package teste;

public class Teste 
{

    public static void main(String[] args) 
   {
        TratarFormas formas = new TratarFormas();
        formas.AdicionarQuadrado(5);
        formas.AdicionarTriangulo(3,5);
        formas.AdicionarEsfera(2);
        formas.AdicionarTetraedro(3);
        formas.AdicionarCubo(5);
        formas.AdicionarCirculo(8);
        for(int i=0 ; i<formas.TamanhoForma() ;i++)
        {
            System.out.println();
            try
            {
               formas.MostrarFormato(i);  
            } 
            catch(NaoExisteVolumeException e)
            {
               System.out.println(e.getMessage());
            }
        }
     
    }
}

    
