//package br.com.target.testes;
//
//
//
//import org.json.simple.*
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//public class FaturamentoDiario {
//
//    public static void main(String[] args) {
//        try {
//            // Carrega os dados do JSON
//            String jsonData = new String(Files.readAllBytes(Paths.get("faturamento.json")));
//            JSONArray faturamentoArray = new JSONArray(jsonData);
//
//            double menorFaturamento = Double.MAX_VALUE;
//            double maiorFaturamento = Double.MIN_VALUE;
//            double somaFaturamento = 0;
//            int diasComFaturamento = 0;
//            int diasAcimaDaMedia = 0;
//
//            // Calcula o menor, maior e soma total ignorando dias sem faturamento
//            for (int i = 0; i < faturamentoArray.length(); i++) {
//                JSONObject dia = faturamentoArray.getJSONObject(i);
//                if (!dia.isNull("valor")) {
//                    double valor = dia.getDouble("valor");
//
//                    if (valor > 0) {
//                        menorFaturamento = Math.min(menorFaturamento, valor);
//                        maiorFaturamento = Math.max(maiorFaturamento, valor);
//                        somaFaturamento += valor;
//                        diasComFaturamento++;
//                    }
//                }
//            }
//
//            // Calcula a média mensal
//            double mediaMensal = somaFaturamento / diasComFaturamento;
//
//            // Conta os dias acima da média
//            for (int i = 0; i < faturamentoArray.length(); i++) {
//                JSONObject dia = faturamentoArray.getJSONObject(i);
//                if (!dia.isNull("valor")) {
//                    double valor = dia.getDouble("valor");
//                    if (valor > mediaMensal) {
//                        diasAcimaDaMedia++;
//                    }
//                }
//            }
//
//            // Exibe os resultados
//            System.out.println("Menor faturamento: R$ " + menorFaturamento);
//            System.out.println("Maior faturamento: R$ " + maiorFaturamento);
//            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
//
//        } catch (Exception e) {
//            System.err.println("Erro ao processar os dados: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
