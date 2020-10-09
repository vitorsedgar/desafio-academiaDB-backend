package br.com.dbserver.desafioacademiadbbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Unidade")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UnidadeEntity {

    @Id
    @Column(name = "cod_uni")
    public long codigo;

    @Column(name = "nome_uni", nullable = false)
    public String nome;

}
