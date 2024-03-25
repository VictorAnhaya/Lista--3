import java.util.Scanner;

public class Ex26 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do pretendente: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do pretendente: ");
        int idade = leitor.nextInt();
        
        if (idade < 17 || idade > 70) {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
            return;
        }
        
        System.out.println("Digite o grupo de risco do pretendente (baixo, médio, alto): ");
        String grupoRisco = leitor.next().toLowerCase();
        
        String categoria;
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco.equals("baixo")) {
                categoria = "Categoria 1";
            } else if (grupoRisco.equals("médio")) {
                categoria = "Categoria 2";
            } else {
                categoria = "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco.equals("médio")) {
                categoria = "Categoria 2";
            } else {
                categoria = "Categoria 3";
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco.equals("baixo")) {
                categoria = "Categoria 3";
            } else if (grupoRisco.equals("médio")) {
                categoria = "Categoria 4";
            } else {
                categoria = "Categoria 5";
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco.equals("baixo")) {
                categoria = "Categoria 4";
            } else if (grupoRisco.equals("alto")) {
                categoria = "Categoria 6";
            } else {
                categoria = "Categoria 7";
            }
        } else {
            if (grupoRisco.equals("alto")) {
                categoria = "Categoria 9";
            } else {
                categoria = "Categoria 7";
            }
        }
        
        System.out.println("\nDados do pretendente:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoria);
        
    }
}

