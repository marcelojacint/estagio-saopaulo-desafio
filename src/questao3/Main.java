package questao3;

public class Main {

    public static void main(String[] args) {


    double[] faturamentoDiario = {1500.0, 2000.0, 2500.0, 1800.0, 2200.0, 2700.0, 2300.0, 2100.0, 2400.0, 2800.0,
            2900.0, 2600.0};

    double menorFaturamento = encontrarMenorFaturamento(faturamentoDiario);
    double maiorFaturamento = encontrarMaiorFaturamento(faturamentoDiario);
    double mediaMensal = calcularMediaMensal(faturamentoDiario);
    int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias acima da média mensal: " + diasAcimaDaMedia);
}

public static double encontrarMenorFaturamento(double[] faturamento) {
    double menor = faturamento[0];
    for (double valor : faturamento) {
        if (valor < menor) {
            menor = valor;
        }
    }
    return menor;
}

public static double encontrarMaiorFaturamento(double[] faturamento) {
    double maior = faturamento[0];
    for (double valor : faturamento) {
        if (valor > maior) {
            maior = valor;
        }
    }
    return maior;
}

public static double calcularMediaMensal(double[] faturamento) {
    double soma = 0;
    for (double valor : faturamento) {
        soma += valor;
    }
    return soma / faturamento.length;
}

public static int contarDiasAcimaDaMedia(double[] faturamento, double media) {
    int contador = 0;
    for (double valor : faturamento) {
        if (valor > media) {
            contador++;
        }
    }
    return contador;
}
}
