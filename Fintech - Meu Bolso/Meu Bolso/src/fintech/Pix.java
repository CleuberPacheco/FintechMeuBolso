//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pix {
    public Long id;
    public String endToEndId;
    public String tipoChave;
    public String chaveOrigem;
    public String chaveDestino;
    public BigDecimal valor;
    public String descricao;
    public String status;
    public LocalDateTime dataHoraCriacao;
    public LocalDateTime dataHoraProcessamento;
    public String tipoTransacao;
    public Conta contaOrigem;
    public Conta contaDestino;

    public Pix() {
    }

    public Pix(String chaveOrigem, String chaveDestino, BigDecimal valor, Conta contaOrigem) {
        this.chaveOrigem = chaveOrigem;
        this.chaveDestino = chaveDestino;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.dataHoraCriacao = LocalDateTime.now();
        this.status = "PENDENTE";
    }

    public void enviarPix() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.valor);
        var10000.println("Executando enviarPix() - Enviando PIX de R$" + var10001 + " para chave: " + this.chaveDestino);
    }

    public void receberPix() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.valor);
        var10000.println("Executando receberPix() - Recebendo PIX de R$" + var10001 + " da chave: " + this.chaveOrigem);
    }

    public void devolverPix(BigDecimal valorDevolucao) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(valorDevolucao);
        var10000.println("Executando devolverPix() - Devolvendo R$" + var10001 + " referente ao PIX: " + this.endToEndId);
    }

    public void consultarStatus() {
        System.out.println("Executando consultarStatus() - Consultando status do PIX: " + this.endToEndId + " | Status: " + this.status);
    }

    public void gerarQrCode() {
        System.out.println("Executando gerarQrCode() - Gerando QR Code para PIX no valor de R$" + String.valueOf(this.valor));
    }

    public void agendarPix(LocalDateTime dataHoraAgendamento) {
        System.out.println("Executando agendarPix() - Agendando PIX para: " + String.valueOf(dataHoraAgendamento));
    }

    public void cancelarPix() {
        System.out.println("Executando cancelarPix() - Cancelando PIX agendado: " + this.endToEndId);
    }
}
