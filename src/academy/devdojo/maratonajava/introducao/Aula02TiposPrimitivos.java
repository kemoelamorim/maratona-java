package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");
        // int, double, float, char, byte, long, boolean
        long numeroGrande = (long) 10000000D; // Casting para long -> Força para caber em um long
        int age = 29;
        double salarioDouble = 20000;
        float salarioFloat = 2500.0f;
        byte idadeByte = -128;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        char caractereUnicode = '\u0041';
        String nome = "Kemoel Amorim Miranda"; // String não é um tipo primitivo

        System.out.println("Oi meu nome é "+nome);
        System.out.println("Minha idade: " + age + " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(caractereUnicode);
    }
}
