package fintech;

public class Endereco {

    // ATRIBUTOS
    public int id;
    public String logradouro;       // Nome da rua, avenida, praça, etc. (ex: "Av. Paulista")
    public String numero;           // Número do imóvel
    public String complemento;      // Informação adicional (ex: "Apto 101", "Bloco B")
    public String bairro;           // Bairro onde o imóvel está localizado
    public String cidade;           // Município do endereço
    public String estado;           // Unidade Federativa (UF) ou estado (ex: "SP", "RJ")
    public String cep;              // Código de Endereçamento Postal
    public String pais;             // País de localização

    // CONSTRUTOR PADRÃO
    public Endereco() {
    }

    // CONSTRUTOR COM PARÂMETROS
    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = "Brasil"; // Define um valor padrão para facilitar o cadastro de clientes locais
    }

    //Valida se o formato do CEP informado é válido (ex: possui 8 dígitos, não contém letras).
    public void validarCep() {
        // Lógica simulada de validação
        System.out.println("Executando validarCep() - Validando CEP: " + this.cep);
    }

    // Realiza a busca dos dados do endereço a partir de um CEP fornecido.
    public void buscarEnderecoPorCep(String cep) {
        // Lógica simulada de integração com API de CEP
        System.out.println("Executando buscarEnderecoPorCep() - Buscando endereço para o CEP: " + cep);
    }

    // Atualiza as informações do endereço no sistema ou no banco de dados.
    public void atualizarEndereco() {
        // Lógica simulada de atualização (ex: um comando UPDATE no banco de dados)
        System.out.println("Executando atualizarEndereco() - Atualizando endereço: " + this.logradouro + ", " + this.numero + " - " + this.cidade);
    }
}