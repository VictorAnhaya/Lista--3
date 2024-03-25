import java.util.Scanner;

public class Ex17 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = leitor.nextLine();
        
        System.out.println("Digite o salário do funcionário em reais: ");
        double salarioFuncionario = leitor.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo em reais: ");
        double salarioMinimo = leitor.nextDouble();
        
        double novoSalario = 0;
        double reajuste = 0;
        
        if (salarioFuncionario < 3 * salarioMinimo) {
            reajuste = salarioFuncionario * 0.50; 
        } else if (salarioFuncionario >= 3 * salarioMinimo && salarioFuncionario <= 10 * salarioMinimo) {
            reajuste = salarioFuncionario * 0.20;
        } else if (salarioFuncionario > 10 * salarioMinimo && salarioFuncionario <= 20 * salarioMinimo) {
            reajuste = salarioFuncionario * 0.15; 
        } else {
            reajuste = salarioFuncionario * 0.10; 
        }
        
        novoSalario = salarioFuncionario + reajuste;
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);
        
        double aumentoFolha = reajuste;
        
        System.out.println("A empresa aumentará sua folha de pagamento em R$" + aumentoFolha);
        
    }
}

