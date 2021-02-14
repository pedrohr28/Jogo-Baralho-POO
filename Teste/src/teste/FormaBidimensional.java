package teste;


import teste.Forma;


public abstract class FormaBidimensional implements Forma
{
    
    private double area;
    
    public FormaBidimensional()
    {
        this.area = 0;
    }

    public double getArea() 
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }
    
}
