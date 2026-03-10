//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    public Long id;
    public String codigoTransacao;
    public String tipoTransacao;
    public BigDecimal valor;
    public LocalDateTime dataHora;
    public String status;
    public String descricao;
    public String categoria;
    public Conta contaOrigem;
    public Conta contaDestino;

    public Transacao() {
    }

    public Transacao(String tipoTransacao, BigDecimal valor, Conta contaOrigem, Conta contaDestino) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.dataHora = LocalDateTime.now();
        this.status = "PENDENTE";
    }

    public void processarTransacao() {
        System.out.println("Executando processarTransacao() - Processando transação: " + this.codigoTransacao);
    }

    public void cancelarTransacao() {
        System.out.println("Executando cancelarTransacao() - Cancelando transação: " + this.codigoTransacao);
    }

    public void estornarTransacao() {
        System.out.println("Executando estornarTransacao() - Estornando transação: " + this.codigoTransacao);
    }

    public void consultarStatus() {
        System.out.println("Executando consultarStatus() - Status da transação " + this.codigoTransacao + ": " + this.status);
    }

    public void gerarComprovante() {
        System.out.println("Executando gerarComprovante() - Gerando comprovante da transação: " + this.codigoTransacao);
    }
}
