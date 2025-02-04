package br.com.target.testes;
//Questão
//Dado o valor de faturamento mensal de uma distribuidora, detalhado por
//estado:
//        • SP – R$67.836,43
//        • RJ – R$36.678,66
//        • MG – R$29.229,88
//        • ES – R$27.165,48
//        • Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar onde calcule o percentual
//de representação que cada estado teve dentro do valor total mensal
//da distribuidora.

public class FaturamentoPorEstado {
    public static void main(String[] args) {
        // Faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calcula o faturamento total
        double total = sp + rj + mg + es + outros;

        // Calcula os percentuais de representação
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        // Exibe os resultados
        System.out.printf("Percentual de representação por estado:\n");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
