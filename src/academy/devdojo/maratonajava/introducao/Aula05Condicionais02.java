package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais02 {
    public static void main(String[] args) {

        // idade < 15 categora infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 14;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if(idade >= 15){
            categoria = " Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
