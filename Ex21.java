import java.util.Scanner;

public class Ex21 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador: ");
        int idade = leitor.nextInt();
        
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }
        
        System.out.println("Categoria do nadador: " + categoria);
        
    }
}

