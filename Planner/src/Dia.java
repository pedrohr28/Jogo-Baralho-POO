import java.util.HashMap;
public class Dia
{
    private  Compromisso[] compromisso;
    private int compromissos;
    public Dia()
    {     
        compromisso= new Compromisso[10];
        compromissos=0;
    }
    public void setDia(int duracao,String descricao,int horario)
    {
       
        compromisso[compromissos]=new Compromisso();
        compromisso[compromissos].setCompromisso(duracao, descricao,horario);
        compromissos++;
    }
    public void getCompromisso()
    {
        for(int i=0;i<compromissos;i++)
        {
            System.out.println("Descricao: "+compromisso[i].getCompromisso());
            System.out.println("Horario: "+compromisso[i].getHorario()); 
            System.out.println("Duracao: "+compromisso[i].getDuracao()); 
        }            
    }
    public int getHoras()
    {
        return this.compromisso[compromissos].getHoras();
    }
    public int getQuantidadeCompromisso()
    {
        return this.compromissos;
    }
}