
public class Compromisso 
{   
    private String descricao1;
    private int horas;
    private int duracao;
    public Compromisso()
    {
        descricao1="";
        horas=0;
        duracao=0;
    }

    public void setCompromisso(int duracao,String descricao,int horas)
    {
        if(horas>=9&&horas<=18)
        {
            this.descricao1=descricao;
            this.horas=horas;
            this.duracao=duracao;
        }
        if(this.horas>18)
        {
            System.out.println("Horario do dia cheio");
        }
     
    }
    public String getCompromisso()
    {
        return this.descricao1;
    }
    public int getHoras()
    {
        return this.horas;
    }
    public int getHorario()
    {
        return this.horas-this.duracao;
    } 
    public int getDuracao()
    {
        return this.duracao;
    }

  
        
}