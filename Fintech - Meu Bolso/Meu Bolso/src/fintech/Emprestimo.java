//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Emprestimo {
    public Long id;
    public String codigoEmprestimo;
    public BigDecimal valorSolicitado;
    public BigDecimal valorAprovado;
    public BigDecimal valorParcela;
    public int quantidadeParcelas;
    public int parcelasPagas;
    public double taxaJurosMensal;
    public double taxaJurosAnual;
    public String status;
    public String finalidade;
    public LocalDate dataSolicitacao;
    public LocalDate dataAprovacao;
    public LocalDate dataVencimento;
    public Usuario solicitante;
    public Conta contaDebito;

    public Emprestimo() {
    }

    public Emprestimo(BigDecimal valorSolicitado, int quantidadeParcelas, String finalidade, Usuario solicitante) {
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        this.finalidade = finalidade;
        this.solicitante = solicitante;
        this.dataSolicitacao = LocalDate.now();
        this.status = "SOLICITADO";
        this.parcelasPagas = 0;
    }

    public void solicitarEmprestimo() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.valorSolicitado);
        var10000.println("Executando solicitarEmprestimo() - Solicitando empréstimo de R$" + var10001 + " para: " + this.solicitante.nome);
    }

    public void aprovarEmprestimo() {
        System.out.println("Executando aprovarEmprestimo() - Aprovando empréstimo: " + this.codigoEmprestimo);
    }

    public void reprovarEmprestimo(String motivo) {
        System.out.println("Executando reprovarEmprestimo() - Reprovando empréstimo: " + this.codigoEmprestimo + " | Motivo: " + motivo);
    }

    public void pagarParcela(int numeroParcela) {
        System.out.println("Executando pagarParcela() - Pagando parcela " + numeroParcela + " do empréstimo: " + this.codigoEmprestimo);
    }

    public void quitarEmprestimo() {
        System.out.println("Executando quitarEmprestimo() - Quitando empréstimo: " + this.codigoEmprestimo);
    }

    public BigDecimal calcularSaldoDevedor() {
        System.out.println("Executando calcularSaldoDevedor() - Calculando saldo devedor do empréstimo: " + this.codigoEmprestimo);
        return BigDecimal.ZERO;
    }

    public void simularEmprestimo(BigDecimal valor, int parcelas) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(valor);
        var10000.println("Executando simularEmprestimo() - Simulando empréstimo de R$" + var10001 + " em " + parcelas + " parcelas");
    }
}
