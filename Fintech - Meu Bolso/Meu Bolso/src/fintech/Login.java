
package fintech;

import java.time.LocalDateTime;

// Representa a entidade de Autenticação e Sessão no sistema.
// Gerencia as credenciais de acesso, controle de tentativas e o estado
// de bloqueio do usuário por motivos de segurança.

public class Login {

    // Credenciais de acesso

    public String username;     // O nome de usuário ou identificador único para login.
    public String password;     // A senha do usuário. (Atenção: em produção, nunca deve ser armazenada em texto plano).

    // Controle de segurança e acessos

    public int tentativasLogin;     // Contador de falhas consecutivas para prevenção de ataques de força bruta.
    public boolean contaBloqueada;      // Flag que indica se a conta foi suspensa temporária ou permanentemente.
    public LocalDateTime ultimoAcesso;      // Data e hora do último acesso com sucesso ao sistema.

    // Construtor padrão
    public Login() {
    }

    // Construtor para inicializar as credenciais básicas do usuário.
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // METODOS

    // Valida as credenciais e inicia a sessão do usuário no sistema.
    // Em caso de falha, deve incrementar a variável 'tentativasLogin'.
    public void doLogin() {
        System.out.println("Realizando login para o usuário: " + this.username);
    }

    // Encerra a sessão ativa do usuário e invalida os tokens de acesso atuais.
    public void doLogout() {
        System.out.println("Executando doLogout() - Encerrando sessão do usuário: " + this.username);
    }

    // Inicia o fluxo de recuperação de credenciais, enviando instruções
    // de redefinição para o contato cadastrado.
    public void resetarSenha(String email) {
        System.out.println("Executando resetarSenha() - Enviando redefinição de senha para: " + email);
    }

    // Valida um token de autenticação (como JWT ou token de duplo fator - 2FA).
    public void validarToken(String token) {
        System.out.println("Executando validarToken() - Validando token de autenticação para: " + this.username);
    }
}
