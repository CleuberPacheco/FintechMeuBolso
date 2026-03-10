//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
    public Long id;
    public String numeroConta;
    public String agencia;
    public String tipoConta;
    public BigDecimal saldo;
    public BigDecimal limite;
    public boolean ativa;
    public LocalDate dataCriacao;
    public Usuario titular;

    public Conta() {
    }

    public Conta(String numeroConta, String agencia, String tipoConta, Usuario titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
        this.ativa = true;
        this.dataCriacao = LocalDate.now();
    }

    public void depositar(BigDecimal valor) {
        System.out.println("Executando depositar() - Depositando valor na conta: " + this.numeroConta);
    }

    public void sacar(BigDecimal valor) {
        System.out.println("Executando sacar() - Realizando saque na conta: " + this.numeroConta);
    }

    public void transferir(BigDecimal valor, Conta contaDestino) {
        System.out.println("Executando transferir() - Transferindo da conta " + this.numeroConta + " para conta: " + contaDestino.numeroConta);
    }

    public BigDecimal consultarSaldo() {
        System.out.println("Executando consultarSaldo() - Consultando saldo da conta: " + this.numeroConta);
        return this.saldo;
    }

    public void encerrarConta() {
        System.out.println("Executando encerrarConta() - Encerrando conta: " + this.numeroConta);
    }

    public void atualizarLimite(BigDecimal novoLimite) {
        System.out.println("Executando atualizarLimite() - Atualizando limite da conta: " + this.numeroConta);
    }
}
