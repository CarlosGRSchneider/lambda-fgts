package fgts;

public class FgtsRequest {

    private double montanteInicial;
    private double valorSalario;
    private int nroMeses;
    private int saqueAniversario = 0;

    public FgtsRequest() {
    }

    public FgtsRequest(double montanteInicial, double valorSalario, int nroMeses, int saqueAniversario) {
        this.montanteInicial = montanteInicial;
        this.valorSalario = valorSalario;
        this.nroMeses = nroMeses;
        this.saqueAniversario = saqueAniversario;
    }

    public double getMontanteInicial() {
        return montanteInicial;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public int getNroMeses() {
        return nroMeses;
    }

    public int getSaqueAniversario() {
        return saqueAniversario;
    }


    public void setMontanteInicial(double montanteInicial) {
        this.montanteInicial = montanteInicial;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public void setNroMeses(int nroMeses) {
        this.nroMeses = nroMeses;
    }

    public void setSaqueAniversario(int saqueAniversario) {
        this.saqueAniversario = saqueAniversario;
    }
}