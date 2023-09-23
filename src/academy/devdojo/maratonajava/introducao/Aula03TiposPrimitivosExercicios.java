package academy.devdojo.maratonajava.introducao;
/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereco>,
* confirmo  que recebi o salário de <salario>, na data <data>
*
* */
public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {
        String nome = "Kemoel Amorim Miranda";
        String endereco = "Rua das Canelas 15, apto 302";
        double salario = 9390.90;
        String dataRecebimento = "05/10/2023";
        String relatorio = "Eu " +nome + ", morando no endereço: " +endereco+ ", confirmo que recebi o salário de "+salario+", na data " +dataRecebimento;
        System.out.println(relatorio);
    }
}
