//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

import java.time.LocalDateTime;

public class Login {
    public String username;
    public String password;
    public int tentativasLogin;
    public boolean contaBloqueada;
    public LocalDateTime ultimoAcesso;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void doLogin() {
        System.out.println("Realizando login para o usuário: " + this.username);
    }

    public void doLogout() {
        System.out.println("Executando doLogout() - Encerrando sessão do usuário: " + this.username);
    }

    public void resetarSenha(String email) {
        System.out.println("Executando resetarSenha() - Enviando redefinição de senha para: " + email);
    }

    public void validarToken(String token) {
        System.out.println("Executando validarToken() - Validando token de autenticação para: " + this.username);
    }
}
