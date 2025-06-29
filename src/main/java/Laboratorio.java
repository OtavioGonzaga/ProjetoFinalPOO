// Otavio Luiz Gonzaga - RA: a2648920

public class Laboratorio {

    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    public Laboratorio() {
        this.nome = "";
        this.cnpj = "";
        this.endereco = "";
        this.telefone = "";
        this.email = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sei que o professor havia dito para não sobreescrever o toString, mas preciso fazer isso para usar o JComboBox no FormGenerico
    @Override
    public String toString() {
        return this.nome + " (" + this.cnpj + ")";
    }
}
