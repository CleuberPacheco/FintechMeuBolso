
package fintech;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

// Representa a entidade de Empréstimo no sistema.
// Guarda as informações da solicitação, aprovação, valores, taxas e status de um empréstimo
// vinculado a um usuário (solicitante) e uma conta de débito.

public class Emprestimo {

    // Identificadores e referências
    public int id;
    public String codigoEmprestimo;

    // Valores financeiros
    public BigDecimal valorSolicitado;
    public BigDecimal valorAprovado;
    public BigDecimal valorParcela;

    // Dados de parcelamento e taxas
    public int quantidadeParcelas;
    public int parcelasPagas;
    public double taxaJurosMensal;
    public double taxaJurosAnual;

    // Metadados do empréstimo
    public String status;       // Ex: SOLICITADO, APROVADO, REPROVADO, QUITADO
    public String finalidade;

    // Datas importantes do ciclo de vida do empréstimo
    public LocalDate dataSolicitacao;
    public LocalDate dataAprovacao;
    public LocalDate dataVencimento;

    // Relacionamentos
    public Usuario solicitante;
    public Conta contaDebito;


    // Construtor padrão.
    public Emprestimo() {
    }

    // Construtor para inicializar uma nova solicitação de empréstimo.
    // Define a data de solicitação para a data atual e o status inicial como "SOLICITADO".
    public Emprestimo(BigDecimal valorSolicitado, int quantidadeParcelas, String finalidade, Usuario solicitante) {
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        this.finalidade = finalidade;
        this.solicitante = solicitante;
        this.dataSolicitacao = LocalDate.now();
        this.status = "SOLICITADO";
        this.parcelasPagas = 0;
    }

    // Executa a rotina de solicitação de um empréstimo.
    // Dispara as validações iniciais para o solicitante.
    public void solicitarEmprestimo() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.valorSolicitado);
        var10000.println("Executando solicitarEmprestimo() - Solicitando empréstimo de R$" + var10001 + " para: " + this.solicitante.nome);
    }

    // Aprova o empréstimo, alterando seu status e liberando o valor.
    public void aprovarEmprestimo() {
        System.out.println("Executando aprovarEmprestimo() - Aprovando empréstimo: " + this.codigoEmprestimo);
    }

    // Reprova a solicitação de empréstimo do usuário.
    public void reprovarEmprestimo(String motivo) {
        System.out.println("Executando reprovarEmprestimo() - Reprovando empréstimo: " + this.codigoEmprestimo + " | Motivo: " + motivo);
    }

    // Processa o pagamento de uma parcela específica do empréstimo.
    public void pagarParcela(int numeroParcela) {
        System.out.println("Executando pagarParcela() - Pagando parcela " + numeroParcela + " do empréstimo: " + this.codigoEmprestimo);
    }

    // Realiza a quitação total do empréstimo antecipadamente ou ao final do contrato.
    public void quitarEmprestimo() {
        System.out.println("Executando quitarEmprestimo() - Quitando empréstimo: " + this.codigoEmprestimo);
    }

    // Calcula o saldo devedor atualizado do empréstimo, considerando juros e parcelas já pagas.
    public BigDecimal calcularSaldoDevedor() {
        System.out.println("Executando calcularSaldoDevedor() - Calculando saldo devedor do empréstimo: " + this.codigoEmprestimo);
        return BigDecimal.ZERO;
    }

    // Realiza uma simulação de empréstimo sem criar uma solicitação real.
    public void simularEmprestimo(BigDecimal valor, int parcelas) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(valor);
        var10000.println("Executando simularEmprestimo() - Simulando empréstimo de R$" + var10001 + " em " + parcelas + " parcelas");
    }
}
