import java.util.Scanner;

public class Ex18{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do funcionário: ");
        int idade = leitor.nextInt();
        
        System.out.println("Digite o sexo do funcionário (M/F): ");
        char sexo = leitor.next().charAt(0);
        
        System.out.println("Digite o salário fixo do funcionário: ");
        double salarioFixo = leitor.nextDouble();
        
        double abono = 0;
        
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        } else {
            System.out.println("Sexo inválido.");
            return;
        }
        
        double salarioLiquido = salarioFixo + abono;
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);
        
    }
}
