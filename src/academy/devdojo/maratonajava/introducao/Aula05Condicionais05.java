package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais05 {
    public static void main(String[] args) {
        // Imprima os dias da semanda considerando 1 como domingo;
        byte dia = 5;
        // int, char, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
