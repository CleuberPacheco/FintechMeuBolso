package fintech;

import java.time.LocalDate;

// Representa o cliente final da Fintech.
// Esta classe armazena dados pessoais e a associação com a conta bancária.

public class Usuario {
    // ATRIBUTOS (DADOS DO USUÁRIO)
    public int id;
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String senha;
    public LocalDate dataNascimento;
    public LocalDate dataCadastro;
    public String status;      // Ex: "ATIVO", "BLOQUEADO"
    public Endereco endereco;  // Associação: O usuário possui um endereço
    public Conta contas;       // Associação: O usuário possui uma conta vinculada

    // CONSTRUTOR PADRÃO
    public Usuario() {
    }

    // CONSTRUTOR COM PARÂMETROS

    // Facilita a criação do usuário já com os dados principais e a conta
    public Usuario(String nome, String cpf, String email, String senha, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = LocalDate.now(); // Define a data de cadastro como a data atual
        this.status = "ATIVO";              // Todo usuário novo começa como ATIVO
        this.contas = conta;                 // Vincula a conta passada no parâmetro ao atributo 'contas'
    }

    // MÉTODOS DE AÇÃO (REGRAS DE NEGÓCIO)

    public void cadastrar() {
        System.out.println("Executando cadastrar() - Cadastrando novo usuário: " + this.nome);
    }

    public void atualizarDados() {
        System.out.println("Executando atualizarDados() - Atualizando dados do usuário: " + this.nome);
    }

    public void alterarSenha(String novaSenha) {
        // Futuramente: this.senha = novaSenha;
        System.out.println("Executando alterarSenha() - Alterando senha do usuário: " + this.nome);
    }

    public void bloquearUsuario() {
        // Futuramente: this.status = "BLOQUEADO";
        System.out.println("Executando bloquearUsuario() - Bloqueando usuário: " + this.nome);
    }

    public void ativarUsuario() {
        // Futuramente: this.status = "ATIVO";
        System.out.println("Executando ativarUsuario() - Ativando usuário: " + this.nome);
    }
}