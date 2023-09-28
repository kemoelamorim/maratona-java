package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais04 {

    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFalxa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImporto;
        if(salarioAnual <= 34712){
            valorImporto = salarioAnual * primeiraFalxa;
        } else if(salarioAnual > 34712 && salarioAnual <= 68507){
            valorImporto = salarioAnual * segundaFaixa;
        } else {
            valorImporto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImporto);
    }
}
