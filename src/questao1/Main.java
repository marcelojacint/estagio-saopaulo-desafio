package questao1;


public class Main {

    public static void main(String[] args) {

        somar();


    }

    private static void somar() {

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println("valor da soma = " + soma);
    }
}
