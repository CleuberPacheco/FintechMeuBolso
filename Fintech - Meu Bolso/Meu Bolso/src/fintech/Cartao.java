//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Cartao {
    public Long id;
    public String numeroCartao;
    public String nomeTitular;
    public String cvv;
    public LocalDate dataValidade;
    public String tipoCartao;
    public String bandeira;
    public BigDecimal limiteTotal;
    public BigDecimal limiteDisponivel;
    public boolean bloqueado;
    public boolean virtual;
    public Conta conta;

    public Cartao() {
    }

    public Cartao(String numeroCartao, String nomeTitular, String tipoCartao, String bandeira, Conta conta) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.tipoCartao = tipoCartao;
        this.bandeira = bandeira;
        this.conta = conta;
        this.bloqueado = false;
        this.virtual = false;
    }

    public void bloquearCartao() {
        System.out.println("Executando bloquearCartao() - Bloqueando cartão: " + this.numeroCartao);
    }

    public void desbloquearCartao() {
        System.out.println("Executando desbloquearCartao() - Desbloqueando cartão: " + this.numeroCartao);
    }

    public void realizarPagamento(BigDecimal valor, String estabelecimento) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(valor);
        var10000.println("Executando realizarPagamento() - Realizando pagamento de R$" + var10001 + " em: " + estabelecimento);
    }

    public void consultarFatura() {
        System.out.println("Executando consultarFatura() - Consultando fatura do cartão: " + this.numeroCartao);
    }

    public void ajustarLimite(BigDecimal novoLimite) {
        System.out.println("Executando ajustarLimite() - Ajustando limite do cartão: " + this.numeroCartao);
    }

    public void gerarCartaoVirtual() {
        System.out.println("Executando gerarCartaoVirtual() - Gerando cartão virtual para: " + this.numeroCartao);
    }

    public void cancelarCartao() {
        System.out.println("Executando cancelarCartao() - Cancelando cartão: " + this.numeroCartao);
    }
}
