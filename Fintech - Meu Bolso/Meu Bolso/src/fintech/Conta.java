package fintech;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
    //Atributos
    public int id;
    public String numeroConta;     // Número da conta bancária
    public String agencia; // Código da agência bancária
    public String tipoConta; // Tipo da conta (ex.: CORRENTE, POUPANCA)
    public BigDecimal saldo;   // Saldo atual da conta
    public BigDecimal limite; // Limite disponível (ex.: cheque especial ou limite de crédito)
    public boolean ativa; // Indica se a conta está ativa ou não
    public LocalDate dataCriacao; // Data de criação/abertura da conta
    public Usuario titular; // Titular da conta (referência a um objeto Usuario)

    //Construtor padrão
    public Conta() {
    }

    //Construtor principal da conta.
    public Conta(String numeroConta, String agencia, String tipoConta, Usuario titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.titular = titular;
        this.saldo = BigDecimal.ZERO; // Inicializa o saldo em zero
        this.ativa = true; // Conta é criada como ativa
        this.dataCriacao = LocalDate.now(); // Registra a data de criação
    }

    //METODOS

    //Realiza um depósito na conta.
    public void depositar(BigDecimal valor) {
        System.out.println("Executando depositar() - Depositando valor na conta: " + this.numeroConta);
    }

    //Realiza um saque na conta.
    public void sacar(BigDecimal valor) {
        System.out.println("Executando sacar() - Realizando saque na conta: " + this.numeroConta);
    }

    //Transfere um valor desta conta para uma conta de destino.
    public void transferir(BigDecimal valor, Conta contaDestino) {
        System.out.println("Executando transferir() - Transferindo da conta " + this.numeroConta + " para conta: " + contaDestino.numeroConta);
    }

    //Consulta o saldo atual da conta.
    public BigDecimal consultarSaldo() {
        System.out.println("Executando consultarSaldo() - Consultando saldo da conta: " + this.numeroConta);
        return this.saldo;
    }

    //Encerra a conta.
    public void encerrarConta() {
        System.out.println("Executando encerrarConta() - Encerrando conta: " + this.numeroConta);
    }

    //Atualiza o limite disponível da conta.
    public void atualizarLimite(BigDecimal novoLimite) {
        System.out.println("Executando atualizarLimite() - Atualizando limite da conta: " + this.numeroConta);
    }
}
