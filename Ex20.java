import java.util.Scanner;

public class Ex20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número de horas/aula trabalhadas: ");
        int horasAula = leitor.nextInt();
        
        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        int nivelProfessor = leitor.nextInt();
        
        double valorHoraAula;
        switch (nivelProfessor) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido.");
                return;
        }
        
        double salario = horasAula * valorHoraAula;
        
        System.out.println("O salário do professor é: R$" + salario);
        
    }
}

