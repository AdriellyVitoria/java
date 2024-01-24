package orientacaoAoObjeto;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "fiat";
        van.modelo = "Ducato";
        van.numPassageiras = 10;
        van.capCompustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van);
    }

}
