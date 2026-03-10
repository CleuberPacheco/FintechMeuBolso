//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fintech;

public class Endereco {
    public Long id;
    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    public String pais;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = "Brasil";
    }

    public void validarCep() {
        System.out.println("Executando validarCep() - Validando CEP: " + this.cep);
    }

    public void buscarEnderecoPorCep(String cep) {
        System.out.println("Executando buscarEnderecoPorCep() - Buscando endereço para o CEP: " + cep);
    }

    public void atualizarEndereco() {
        System.out.println("Executando atualizarEndereco() - Atualizando endereço: " + this.logradouro + ", " + this.numero + " - " + this.cidade);
    }
}
