package academy.devdojo.maratonajava.introducao;


public class Aula05Condicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

    }
}
