import java.sql.SQLOutput;

// leia-se: Definição de um tipo de "Carro"
public class Carro {

    //Características
    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

    // criar um "Botao" para que eu possa executar algo (mostrar os dados)

    void exibirAnuncio() {
        System.out.println("=====================================");
        System.out.println(marca + "-" + modelo + " (" + ano + ") ");
        System.out.println("Cor: " + cor + " KM: " + km + " R$" + preco);

    }
}
