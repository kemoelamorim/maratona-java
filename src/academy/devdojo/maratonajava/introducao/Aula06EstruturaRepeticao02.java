package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000000;

        for (int i = 1 ; i < 1000000; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
