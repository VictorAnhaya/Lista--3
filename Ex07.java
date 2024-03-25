import java.util.Scanner;

public class Ex07{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = leitor.nextDouble();
        
        double porcentagemDistribuidor = 0.28;
        double porcentagemImpostos = 0.45;
        
        double custoConsumidor = custoFabrica + (custoFabrica * porcentagemImpostos) + (custoFabrica * porcentagemDistribuidor);
        
        System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);
        
    }
}

