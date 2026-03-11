package fintech;

import java.math.BigDecimal;
import java.time.LocalDate;

//Classe que representa um Cartão vinculado a uma conta bancária.
public class Cartao {
    // ATRIBUTOS
    public int id;
    public String numeroCartao;
    public String nomeTitular;
    public String cvv;      // Código de segurança
    public LocalDate dataValidade;
    public String tipoCartao;       // Ex: CRÉDITO, DÉBITO
    public String bandeira;     // Ex: VISA, MASTERCARD
    public BigDecimal limiteTotal;      // Usando BigDecimal para precisão financeira
    public BigDecimal limiteDisponivel;
    public boolean bloqueado;
    public boolean virtual;
    public Conta conta;     // ASSOCIAÇÃO: O cartão pertence a uma conta específica

    // CONSTRUTOR PADRÃO
    public Cartao() {
    }

    // CONSTRUTOR COM PARÂMETROS

    // Inicializa o cartão com os dados essenciais
    public Cartao(String numeroCartao, String nomeTitular, String tipoCartao, String bandeira, Conta conta) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.tipoCartao = tipoCartao;
        this.bandeira = bandeira;
        this.conta = conta;
        this.bloqueado = false; // Cartão nasce desbloqueado por padrão
    }

    // MÉTODOS DE NEGÓCIO (AÇÕES DO CARTÃO) testando

    public void bloquearCartao() {
        System.out.println("Executando bloquearCartao() - Bloqueando cartão: " + this.numeroCartao);
    }

    public void desbloquearCartao() {
        System.out.println("Executando desbloquearCartao() - Desbloqueando cartão: " + this.numeroCartao);
    }

    public void realizarPagamento(BigDecimal valor, String estabelecimento) {
        System.out.println("Executando realizarPagamento() - Realizando pagamento de R$" + valor + " em: " + estabelecimento);
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