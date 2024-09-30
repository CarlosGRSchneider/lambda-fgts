package fgts;

public enum SaqueAniversario {
    FAIXA_UM(500, 0.50, 0),
    FAIXA_DOIS(1000, 0.40, 50),
    FAIXA_TRES(5000, 0.30, 150),
    FAIXA_QUATRO(10000, 0.20, 650),
    FAIXA_CINCO(15000, 0.15, 1150),
    FAIXA_SEIS(20000, 0.10, 1900),
    FAIXA_SETE(Double.MAX_VALUE, 0.05, 2900);

    private final double limite;
    private final double aliquota;
    private final double parcelaAdicional;

    SaqueAniversario(double limite, double aliquota, double parcelaAdicional) {
        this.limite = limite;
        this.aliquota = aliquota;
        this.parcelaAdicional = parcelaAdicional;
    }

    public double getLimite() {
        return limite;
    }

    public double getAliquota() {
        return aliquota;
    }

    public double getParcelaAdicional() {
        return parcelaAdicional;
    }

    public static SaqueAniversario encontrarFaixa(double valor) {
        for (SaqueAniversario faixa : values()) {
            if (valor <= faixa.limite) {
                return faixa;
            }
        }
        return null; // não deve ocorrer com Double.MAX_VALUE
    }
}