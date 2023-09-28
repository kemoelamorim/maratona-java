package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais06 {
    public static void main(String[] args) {
        // Ultilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        int dia = 6;
        switch(dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
