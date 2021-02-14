import java.util.Scanner;
import java.util.ArrayList;
public class TesteAgenda
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        Semana semana= new Semana();
        Compromisso compromisso;
        int armazena_horario=0;
        int horario=9,duracao;
        String descricao="",dia="";
        String opc="",opc2="",opc3="";
        while(!opc3.equals("sair"))
        {    
             System.out.println("Digite 'inserir' para entrar no metodo de inserção das atividades semanal. Digite 'mostrar' para todos as atividades semanal. Digite 'sair' para finaliazar");
             opc3=input.nextLine();
             if(opc3.equals("inserir"))
             {
                opc="";
                while(!opc.equals("sair"))
                {     
                 System.out.println("Digite o dia da semana (exemplo : segunda feira,terca feira,quarta feira,quinta feira,sexta feira)");
                 dia=input.nextLine();
                 while(!opc2.equals("sair"))
                 {
                     System.out.println("Dia da Semana: "+dia);
                     System.out.println("Digite a descricao da atividade:");
                     descricao=input.nextLine();
                     System.out.println("Digite duracao da atividade:");
                     duracao=input.nextInt();
                     armazena_horario+=duracao;
                     semana.setDia(dia, duracao, descricao,horario+armazena_horario);
                     input= new Scanner(System.in);
                     System.out.println("Digite 'sair' para finalzar as atividades diarias:");
                     opc2=input.nextLine();
                 }     
                 System.out.println("Digite 'sair' para terminar, ou continuar para prosseguir inserindo as atividades diarias:");
                 opc=input.nextLine();
                 opc2="";
                 armazena_horario=0;
                }
            }
            if(opc3.equals("mostrar")&&opc.equals("sair"))
            {
                 System.out.println("Agenda Total:");
                 semana.getDias();
            }     
        }     
    } 
}
