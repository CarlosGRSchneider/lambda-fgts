package fgts;

import java.time.LocalDate;

public class LambdaFgts {

    public LambdaFgts() {
    }

    public FgtsResponse calculaFgts(FgtsRequest request) {

        FgtsResponse response = new FgtsResponse(request);

        double valorCalculado = request.getMontanteInicial();
        double incrementoMensal = request.getValorSalario() * 0.08;

        double taxaDeJurosMensal = Double.parseDouble(System.getenv("taxaDeJurosMensal"));
        double trMensal = Double.parseDouble(System.getenv("trMensal"));
        LocalDate dataAtual = LocalDate.now();

        for (int i = 0; i < request.getNroMeses(); i++) {
            double valorInicial = valorCalculado;
            valorCalculado += incrementoMensal;

            double jurosMensais = valorCalculado * (taxaDeJurosMensal + trMensal);
            valorCalculado += jurosMensais;

            double valorSaqueAniversario = 0;
            if (request.getSaqueAniversario() == dataAtual.getMonth().getValue()) {
                SaqueAniversario saqueAniversario = SaqueAniversario.encontrarFaixa(valorCalculado);
                valorSaqueAniversario = (valorCalculado * saqueAniversario.getAliquota()) + saqueAniversario.getParcelaAdicional();
                valorCalculado -= valorSaqueAniversario;
            }

            response.adicionaValorMensal(new ValorMensal(dataAtual, valorInicial, incrementoMensal, jurosMensais, valorSaqueAniversario, valorCalculado));
            dataAtual = dataAtual.plusMonths(1);
        }
        return response;
    }
}