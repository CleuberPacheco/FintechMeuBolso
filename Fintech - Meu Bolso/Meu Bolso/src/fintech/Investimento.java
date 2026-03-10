
package fintech;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Investimento {

    // ATRIBUTOS
    public int id;
    public String codigoInvestimento;     // Código de referência externo ou interno (ex: CDB-123)
    public String tipoInvestimento;       // Tipo de investimento (ex: Renda Fixa, Ações, FIIs)
    public String descricao;              // Breve descrição sobre o que é o investimento
    public String risco;                  // Nível de risco (ex: BAIXO, MEDIO, ALTO)
    public String status;                 // Status atual do investimento (ex: ATIVO, RESGATADO, VENCIDO)
    public BigDecimal valorInvestido;     // Valor inicial aplicado pelo usuário
    public BigDecimal valorAtual;         // Valor atualizado do investimento com os rendimentos
    public BigDecimal rentabilidade;      // Percentual ou valor de rentabilidade acumulada
    public double taxaJuros;              // Taxa de juros aplicada ao investimento
    public LocalDate dataAplicacao;       // Data em que o investimento foi realizado
    public LocalDate dataVencimento;      // Data em que o investimento pode/deve ser resgatado
    public Usuario investidor;            // Objeto do tipo Usuario representando quem fez o investimento
    public Conta contaVinculada;          // Objeto do tipo Conta de onde o dinheiro saiu e para onde o resgate irá

    // CONSTRUTOR PADRÃO
    public Investimento() {
    }

    //Construtor parametrizado para facilitar a criação de um novo investimento.

    public Investimento(String tipoInvestimento, BigDecimal valorInvestido, LocalDate dataVencimento, Usuario investidor) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestido = valorInvestido;
        this.valorAtual = valorInvestido; // No momento da aplicação, o valor atual é igual ao investido
        this.dataVencimento = dataVencimento;
        this.investidor = investidor;
        this.dataAplicacao = LocalDate.now(); // Pega a data atual do sistema automaticamente
        this.status = "ATIVO"; // Define o status inicial padrão
    }

    //Realiza uma nova aplicação ou aporte em um investimento existente.
    //@param valor Valor monetário a ser adicionado ao investimento.
    public void aplicar(BigDecimal valor) {
        // Simulando a lógica de aplicação no console
        System.out.println("Executando aplicar() - Aplicando R$" + valor + " no investimento: " + this.codigoInvestimento);
    }

    //Solicita o resgate do valor investido.
    public void resgatar() {
        System.out.println("Executando resgatar() - Resgatando investimento: " + this.codigoInvestimento);
    }

    //Calcula o rendimento do investimento com base nas taxas e no tempo.
    // O valor do rendimento gerado (atualmente retorna zero como simulação).
    public BigDecimal calcularRendimento() {
        System.out.println("Executando calcularRendimento() - Calculando rendimento do investimento: " + this.codigoInvestimento);
        return BigDecimal.ZERO; // Placeholder: Aqui entraria a lógica matemática real
    }

     //Exibe o extrato ou histórico das movimentações deste investimento.

    public void consultarExtrato() {
        System.out.println("Executando consultarExtrato() - Consultando extrato do investimento: " + this.codigoInvestimento);
    }

    //Simula qual seria o valor resgatado em uma data futura específica.

    public void simularResgate(LocalDate dataSimulacao) {
        System.out.println("Executando simularResgate() - Simulando resgate do investimento: " + this.codigoInvestimento + " para " + dataSimulacao);
    }

     //Renova o prazo do investimento, estendendo seu vencimento.
    public void renovarInvestimento(LocalDate novaDataVencimento) {
        System.out.println("Executando renovarInvestimento() - Renovando investimento: " + this.codigoInvestimento + " até " + novaDataVencimento);
    }
}