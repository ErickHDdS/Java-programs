/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;


import java.util.Scanner;

public class SistemaPagamentoTeste {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        ControlePagamento controle = new ControlePagamento();
        
        //INSERINDO EMPREGADOS
        Empregado[] empregados = new Empregado[4];
        empregados[0] = new Assalariado("Antonio","Pedro",01);
        empregados[1] = new Comissionado("Gustavo","Lima",04);
        empregados[2] = new Terceirizado("Beatriz","Souza",02);
        empregados[3] = new AssalariadoComissionado("Galvão","Bueno",03);
        //EMPREGADOS INSERIDOS
        
        /*IREMOS SUPOR QUE:
        ANTONIO TRABALHOU 43 HORAS 
        GUSTAVO REALIZOU VENDAS DE 100 REAIS
        BEATRIZ TRABALHOU 50 HORAS
        GALVAO REALIZOU VENDAS DE 50 REAIS
        */
        double horasTrabalhadas, valorVendas;   
        for(int i = 0 ; i < 4 ; i ++)
        {
            System.out.println("\nFUNCIONÁRIO : "+empregados[i].nome);
            System.out.println("DIGITE O VALOR TOTAL DE VENDAS (EM DINHEIRO R$) DE "+empregados[i].nome); valorVendas = leitor.nextDouble();
            while(valorVendas < 0 )
            {
                System.out.println("DIGITE UM VALOR DE VENDAS (EM DINHEIRO R$) VALIDO"); valorVendas = leitor.nextDouble();
            }
            
            System.out.println("DIGITE O TOTAL DE HORAS TRABALHADAS DE "+empregados[i].nome); horasTrabalhadas = leitor.nextDouble();
            
            while(horasTrabalhadas < 0 )
            {
                System.out.println("DIGITE AS HORAS TRABALHADAS VALIDA"); horasTrabalhadas = leitor.nextDouble();
            }
            empregados[i].horasTrabalhadas = horasTrabalhadas;
            empregados[i].valorVendas = valorVendas;
            //REALIZANDO A SOMA DO SEU SALÁRIO
            empregados[i].getValorAPagar();
            controle.somandoSalario(empregados[i]);
            System.out.printf("SALARIO DE %s = R$ %.2f\n",empregados[i].nome,empregados[i].salario);
        }
        
        //INSERINDO CONTAS
        Conta contas[] = new Conta[6];
        contas[0] = new Titulo(01, 10);
        contas[1] = new Titulo(02, 9);
        contas[2] = new Titulo(03, 11);
        contas[3] = new Concessionaria(04, 8);
        contas[4] = new Concessionaria(05, 10);
        contas[5] = new Concessionaria(06, 11);

        
        for(int i = 0 ; i < 6 ; i ++)
        {
            contas[i].getValorAPagar();
            controle.somandoContas(contas[i]);
        }
        
        System.out.printf("\n\nGASTO DE SALÁRIOS TOTAL DA EMPRESA: R$ %.2f",controle.getSomatorioSalarios());
        System.out.printf("\n\nGASTO DE CONTAS TOTAL DA EMPRESA: R$ %.2f\n",controle.getSomatorioConta());
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\nGASTO FINAL: %.2f\n",controle.getSomatorioSalarios()+controle.getSomatorioConta());
    }
}
