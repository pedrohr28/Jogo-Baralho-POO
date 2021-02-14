package teste;

public class Cubo extends FormaTridimensional
{
    
    private double aresta;
    
    public Cubo(double aresta) 
    {
        super();
        this.aresta = aresta;
    }
    
    @Override
    public double calculoVolume() 
    {
        double v;
        v = this.aresta*this.aresta*this.aresta;
        this.setVolume(v);
        return v;
    }

    @Override
    public double calculoArea() 
    {
        double a;
        a = 6*this.aresta*this.aresta;
        this.setArea(a);
        return a;
    }
    
}
