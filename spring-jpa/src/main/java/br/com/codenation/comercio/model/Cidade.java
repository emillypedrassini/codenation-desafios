package br.com.codenation.comercio.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@EntityListeners(AuditingEntityListener.class)

public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @ManyToOne
    @Column(name = "codigo_estado")
    private Estado estado;

    @Column(length= 45)
    @NotEmpty(message = "O campo é obrigatório")
    private String nome;
}
