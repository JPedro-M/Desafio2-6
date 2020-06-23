package desafio2.pkg6;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio26 {
    public static void main(String[] args) {
        int numeroFuncionario, indiceProdutividade;
        double salarioAtual, INPC, aumento, salarioNovo;
        Scanner ler = new Scanner(System.in);
        
        INPC = 75;
        System.out.println("Qual o  número de funcionário?");
        numeroFuncionario = ler.nextInt();
        System.out.println("Qual o  índice de produtividade?");
        indiceProdutividade = ler.nextInt();
        System.out.println("Qual o salário atual?");
        salarioAtual = ler.nextDouble();
        
        aumento = (INPC/100)*salarioAtual+(indiceProdutividade/100)*salarioAtual;
        salarioNovo = salarioAtual+aumento;
        
        System.out.println("Número de funcionário:"+numeroFuncionario+"\nAumento:"+aumento+"\nNovo salário"+salarioNovo);
    }
}
