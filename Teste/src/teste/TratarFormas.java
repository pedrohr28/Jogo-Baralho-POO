package teste;

import teste.Forma;
import java.util.ArrayList;

public class TratarFormas 
{
    private ArrayList<Forma> formas;

    public TratarFormas()
    {
        formas = new ArrayList();
    }
    public void AdicionarQuadrado(double lado)
    {
      formas.add(new Quadrado(lado));
    }
     public void AdicionarCubo(double lado)
    {
      formas.add(new Cubo(lado));
    }
     public void AdicionarEsfera(double raio)
    {
      formas.add(new Esfera(raio));
    }
     public void AdicionarTetraedro(double lado)
    {
      formas.add(new Tetraedro(lado));
    }
    public void AdicionarCirculo(double raio)
    {
      formas.add(new Circulo(raio));
    }
    public void AdicionarTriangulo(double lado1,double altura)
    {
      formas.add(new Triangulo(lado1,altura));
    }
    public int TamanhoForma()
    {
        int tamanho = this.formas.size();
        return tamanho;
    }
    
    public void MostrarFormato(int i) throws NaoExisteVolumeException
    {
        System.out.println(formas.get(i).toString());
        System.out.println("Área = "+(formas.get(i)).calculoArea());
        System.out.println("Volume = "+(formas.get(i)).calculoVolume()); //da erro em bidimensional
    }
}

       
