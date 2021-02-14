import java.util.ArrayList;
public class Semana
{
    private Dia[] dia;
    private ArrayList<String> nomes_dias;
    public Semana()
    {
        dia = new Dia[5];
        nomes_dias = new ArrayList<>();
        preenchernomes();
        preenchendoDias();
    }
    void preenchendoDias()
    {
        for(int k=0; k<5;k++)
        {
            dia[k]=new Dia();
        }
    }
    void preenchernomes()
    {
      nomes_dias.add("segunda feira");
      nomes_dias.add("terca feira");
      nomes_dias.add("quarta feira");
      nomes_dias.add("quinta feira");
      nomes_dias.add("sexta feira");  
   }
   public void setDia(String dia,int duracao,String descricao,int horario)
   {
       
     
     if(nomes_dias.contains(dia))
     {    
       for(int i=0;i<5;i++)
       {
           if(dia.equals(nomes_dias.get(i)))
           {
               this.dia[i].setDia(duracao,descricao,horario);
           }
       }
     }
     else
     {
         System.out.println("Dia da Semana Invalido, Digite outro:");
     }
   }
   public void getDias()
   {
      
       for(int j=0;j<dia.length;j++)
       {
           if(dia[j]!=null)
           {    
                System.out.println("Dia Da Semana: "+nomes_dias.get(j));
                dia[j].getCompromisso();
           }
       }
   }
  
}
