import java.util.Scanner;

public class Ex19 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite os valores dos três lados do triângulo:");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isóscele.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
        
    }
}

