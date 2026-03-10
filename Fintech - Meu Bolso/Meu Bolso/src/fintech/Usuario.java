//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public Long id;
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String senha;
    public LocalDate dataNascimento;
    public LocalDate dataCadastro;
    public String status;
    public Endereco endereco;
    public List<Conta> contas;

    public Usuario() {
        this.contas = new ArrayList();
    }

    public Usuario(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
        this.status = "ATIVO";
        this.contas = new ArrayList();
    }

    public void cadastrar() {
        System.out.println("Executando cadastrar() - Cadastrando novo usuário: " + this.nome);
    }

    public void atualizarDados() {
        System.out.println("Executando atualizarDados() - Atualizando dados do usuário: " + this.nome);
    }

    public void alterarSenha(String novaSenha) {
        System.out.println("Executando alterarSenha() - Alterando senha do usuário: " + this.nome);
    }

    public void bloquearUsuario() {
        System.out.println("Executando bloquearUsuario() - Bloqueando usuário: " + this.nome);
    }

    public void ativarUsuario() {
        System.out.println("Executando ativarUsuario() - Ativando usuário: " + this.nome);
    }

    public List<Conta> listarContas() {
        System.out.println("Executando listarContas() - Listando contas do usuário: " + this.nome);
        return this.contas;
    }
}
