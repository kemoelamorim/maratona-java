package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritiméticos
        // +-/*
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero2 + numero1;
        int subtracao = numero2 - numero1;
        int multiplica = numero2 * numero1;
        double divide = numero2 / numero1;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divide: " + divide);
        System.out.println("Multiplica: " + multiplica);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > | <= >= | == | != (Operadores relacionais, retorna valores boolean)
        int idade = 18;
        boolean isMaiorDeIdade = idade >= 18;
        System.out.println(isMaiorDeIdade);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAhVinte = 10 == 20;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualAhVinte);
        System.out.println(isDezDiferenteQueDez);

        // Operadores Logicos (&& -> AND, || -> OR, ! -> Negação)
        int idadeKemoel = 39;
        boolean acompanhado = true;
        boolean isDentroDaLeiMaiorQueTrinta = idadeKemoel > 30 && acompanhado;

        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valortTotalContaPoupanca = 10000;
        float valorPayStation = 5000;
        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPayStation || valortTotalContaPoupanca > valorPayStation;
        System.out.println("Consigo comprar: " + isPlayStationCompravel);

        // Operadores de atribuição -> (=, +=, -=, *=, /=, %=)
        double bonus = 1800;
        bonus += 2000; // Somando 2000
        System.out.println(bonus);
        bonus -= 2000; // Subtraindo 2000
        System.out.println(bonus);
        bonus *= 2; // Multiplicando por 2
        System.out.println(bonus);
        bonus /= 2; // Dividindo por 2
        System.out.println(bonus);
        bonus %= 2; // Resto da divisao por 2
        System.out.println(bonus);

        // Incrementa & Decrementa
        int contador = 0;
        System.out.println(contador++);
        System.out.println(++contador);
        System.out.println(--contador);
    }
}
