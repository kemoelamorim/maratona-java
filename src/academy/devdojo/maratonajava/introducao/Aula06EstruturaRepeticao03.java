package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50.
        int valorMax = 50;
        for(int i = 0; i <= 50; i++){
            if(i > 25){
                break; // Sai do laço for;
            }
            System.out.println(i);
        }
    }
}
