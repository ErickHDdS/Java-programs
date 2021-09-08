package principalErick;

//import java.util.HashSet;
import java.util.Scanner;

public class CallCenter {
    
    public static void main(String[] args)
    {
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora();
        
        boolean loop = true;
        String resposta;
        String leitor;// = new String();
        String problema;// = new String();
        String respostaAleatoria;// = new String();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de Suporte Técnico");
        while(loop == true)
        {
            System.out.println("\nPressione <enter> para continuar ou digite 'sair' para sair do sistema");
            leitor = input.nextLine();

            if(leitor.equals("sair"))
            {
                System.out.println("\nObrigada por utilizar nossos serviços!");
                loop = false;
            }
            if(leitor.equals(""))
            {
                System.out.println("Descreva seu problema de maneira sucinta");
                problema = input.nextLine();
                String problemaToLowerCase = problema.toLowerCase();
               
                resposta = suporte.procurandoSolucao(interpretadora.interpretar(problemaToLowerCase));

                if(resposta == null)
                {
                    respostaAleatoria = suporte.procurarAleatoria();
                    System.out.println(respostaAleatoria);
                }
                else
                System.out.println(resposta);
            }
        }
    }
}
