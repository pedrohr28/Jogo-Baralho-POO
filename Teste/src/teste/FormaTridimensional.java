package teste;


public abstract class FormaTridimensional implements Forma 
{
    
   private double area;
   private double volume;

    public double getArea() 
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }

    public double getVolume() 
    {
        return volume;
    }

    public void setVolume(double volume) 
    {
        this.volume = volume;
    }

    public FormaTridimensional() 
    {
        this.area = 0;
        this.volume = 0;
    }
   
}
