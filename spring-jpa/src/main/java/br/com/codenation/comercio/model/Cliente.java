package br.com.codenation.comercio.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Cliente {


}
