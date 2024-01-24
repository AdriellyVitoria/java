public class Apresentação {
    public void ola(){
        System.out.println("Olá pessoal da ZG, o meu Interlij está funcionando " );
    }

    public void multiplos(int numeroDesejando, int ultimoNumero){
        int numeroTres = 3;
        int numeroCinco = 5;
        int somaMultiplos = 0;
        for (int i = numeroDesejando; i <= ultimoNumero ; i += numeroDesejando) {
            somaMultiplos += i;
        }
        System.out.println("A soma dos numeros "  + numeroDesejando + " até " + ultimoNumero + " é igual a " + somaMultiplos);
    }
    //separa os multimos de 3
    //somando os multlipls de 3 até 1000
}
