package basicoJava;

import java.util.Scanner;

public class LendoDadosScanner {

    public void mostrar(){
        System.out.println("Digete o seu primeiro nome," +
                " idade," +
                " quantidade de filhos," +
                " altura e " +
                "se tem bicho de estimação");
        Scanner leitura = new Scanner(System.in);

        String primeiroNome = leitura.next();
        int idade = Integer.parseInt(leitura.next());
        int qtdFilhos = Integer.parseInt(leitura.next());
        double altura = Double.parseDouble(leitura.next());
        boolean temPet = Boolean.parseBoolean(leitura.next());


        System.out.println("Vc digitou os seguietes valores " +
                " primeiro nome " + primeiroNome +
                " Idade " + idade +
                " Quantidade de filhos " + qtdFilhos +
                " Altura " + altura +
                " tem animal? " + temPet );

        leitura.close();
    }

}
