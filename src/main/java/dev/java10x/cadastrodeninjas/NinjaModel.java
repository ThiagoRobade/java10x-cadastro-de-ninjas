package dev.java10x.cadastrodeninjas;

import jakarta.persistence.*;

// Entity, transforma uma classe em uma entidade do BD
// JPA - Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String email;
    int idade;

    // No Args Constructor
    public NinjaModel() {
    }

    // All Args Constructors
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
