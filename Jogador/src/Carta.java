
public class Carta 
{
    private String naipe;
    private int valor;
    public Carta()
    {
        naipe="";
        valor=0;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    
}
