package fgts;

import java.util.ArrayList;
import java.util.List;

public class FgtsResponse {

    private double montanteInicial;
    private double valorSalario;
    private int nroMeses;
    private int saqueAniversario = 0;
    private List<ValorMensal> valoresMensais = new ArrayList<>();


    public FgtsResponse(FgtsRequest request) {
        this.montanteInicial = request.getMontanteInicial();
        this.valorSalario = request.getValorSalario();
        this.nroMeses = request.getNroMeses();
        this.saqueAniversario = request.getSaqueAniversario();
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

    public List<ValorMensal> getValoresMensais() {
        return valoresMensais;
    }

    public void adicionaValorMensal(ValorMensal valorMensal) {
        valoresMensais.add(valorMensal);
    }
}
