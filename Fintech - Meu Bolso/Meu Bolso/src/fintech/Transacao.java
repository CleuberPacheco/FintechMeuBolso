package fintech;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {

    public Long id; // Identificador único da transação (pode ser usado para persistência em banco de dados)
    public String codigoTransacao; // Código da transação (ex.: identificador externo ou referência)
    public String tipoTransacao; // Tipo da transação (ex.: DEPOSITO, SAQUE, TRANSFERENCIA)
    public BigDecimal valor; // Valor monetário da transação
    public LocalDateTime dataHora; // Data e hora em que a transação foi criada ou registrada
    public String status; // Status atual da transação (ex.: PENDENTE, CONCLUIDA, CANCELADA)
    public String descricao; // Descrição livre da transação (detalhes adicionais)
    public String categoria; // Categoria da transação (ex.: ALIMENTACAO, LAZER, CONTAS)
    public Conta contaOrigem; // Conta de origem envolvida na transação (pode ser nula em alguns tipos)
    public Conta contaDestino; // Conta de destino envolvida na transação (pode ser nula em alguns tipos)

    //Construtor padrão sem argumentos. Utilizado por frameworks, bibliotecas de serialização ou mapeamento ORM.//

    public Transacao() {
    }

    //Construtor principal da transação.//

    public Transacao(String tipoTransacao, BigDecimal valor, Conta contaOrigem, Conta contaDestino) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.dataHora = LocalDateTime.now();   // Registra a data e hora de criação da transação
        this.status = "PENDENTE";              // Transação é criada inicialmente como pendente
    }
    //Metodos

    //Processa a transação. No momento, apenas registra uma mensagem de log com o código da transação.//

    public void processarTransacao() {
        System.out.println("Executando processarTransacao() - Processando transação: " + this.codigoTransacao);
    }

    //Cancela a transação. No momento, apenas registra uma mensagem de log com o código da transação.//

    public void cancelarTransacao() {
        System.out.println("Executando cancelarTransacao() - Cancelando transação: " + this.codigoTransacao);
    }

    //Estorna a transação (desfaz os efeitos da operação original).No momento, apenas registra uma mensagem de log com o código da transação.//

    public void estornarTransacao() {
        System.out.println("Executando estornarTransacao() - Estornando transação: " + this.codigoTransacao);
    }

    //Consulta o status atual da transação. No momento, apenas imprime o status no console. //

    public void consultarStatus() {
        System.out.println("Executando consultarStatus() - Status da transação " + this.codigoTransacao + ": " + this.status);
    }

    // Gera o comprovante da transação. No momento, apenas registra uma mensagem de log com o código da transação.//

    public void gerarComprovante() {
        System.out.println("Executando gerarComprovante() - Gerando comprovante da transação: " + this.codigoTransacao);
    }
}
