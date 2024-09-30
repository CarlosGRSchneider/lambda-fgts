package fgts;

import java.time.LocalDate;

public class ValorMensal {

    private LocalDate dataAtual;
    private double totalParcialInicio;
    private double incrementoMensal;
    private double jurosMensais;
    private double valorSaqueAniversario;
    private double totalParcialFim;

    public ValorMensal(LocalDate dataAtual, double totalParcialInicio, double incrementoMensal, double jurosMensais, double valorSaqueAniversario, double totalParcialFim) {
        this.dataAtual = dataAtual;
        this.totalParcialInicio = totalParcialInicio;
        this.incrementoMensal = incrementoMensal;
        this.jurosMensais = jurosMensais;
        this.valorSaqueAniversario = valorSaqueAniversario;
        this.totalParcialFim = totalParcialFim;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public double getTotalParcialInicio() {
        return totalParcialInicio;
    }

    public double getTotalParcialFim() {
        return totalParcialFim;
    }

    public double getIncrementoMensal() {
        return incrementoMensal;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public double getValorSaqueAniversario() {
        return valorSaqueAniversario;
    }
}
