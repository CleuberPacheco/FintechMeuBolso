//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Investimento {
    public Long id;
    public String codigoInvestimento;
    public String tipoInvestimento;
    public String descricao;
    public BigDecimal valorInvestido;
    public BigDecimal valorAtual;
    public BigDecimal rentabilidade;
    public double taxaJuros;
    public LocalDate dataAplicacao;
    public LocalDate dataVencimento;
    public String status;
    public String risco;
    public Usuario investidor;
    public Conta contaVinculada;

    public Investimento() {
    }

    public Investimento(String tipoInvestimento, BigDecimal valorInvestido, LocalDate dataVencimento, Usuario investidor) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestido = valorInvestido;
        this.valorAtual = valorInvestido;
        this.dataVencimento = dataVencimento;
        this.investidor = investidor;
        this.dataAplicacao = LocalDate.now();
        this.status = "ATIVO";
    }

    public void aplicar(BigDecimal valor) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(valor);
        var10000.println("Executando aplicar() - Aplicando R$" + var10001 + " no investimento: " + this.codigoInvestimento);
    }

    public void resgatar() {
        System.out.println("Executando resgatar() - Resgatando investimento: " + this.codigoInvestimento);
    }

    public BigDecimal calcularRendimento() {
        System.out.println("Executando calcularRendimento() - Calculando rendimento do investimento: " + this.codigoInvestimento);
        return BigDecimal.ZERO;
    }

    public void consultarExtrato() {
        System.out.println("Executando consultarExtrato() - Consultando extrato do investimento: " + this.codigoInvestimento);
    }

    public void simularResgate(LocalDate dataSimulacao) {
        String var10001 = this.codigoInvestimento;
        System.out.println("Executando simularResgate() - Simulando resgate do investimento: " + var10001 + " para " + String.valueOf(dataSimulacao));
    }

    public void renovarInvestimento(LocalDate novaDataVencimento) {
        String var10001 = this.codigoInvestimento;
        System.out.println("Executando renovarInvestimento() - Renovando investimento: " + var10001 + " até " + String.valueOf(novaDataVencimento));
    }
}
