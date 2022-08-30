package dominio;

import java.io.Serializable;

/**
 * Pessoa
 */
public class Pessoa implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    
    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [email=" + email + ", id=" + id + ", nome=" + nome + "]";
    }

    
}