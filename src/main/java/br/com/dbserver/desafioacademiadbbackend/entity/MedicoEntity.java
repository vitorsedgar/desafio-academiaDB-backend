package br.com.dbserver.desafioacademiadbbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Medico")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicoEntity {

    @Id
    @Column(name = "cod_med")
    public String codigo;

    @Column(name = "nome_med", nullable = false)
    public String nome;

    @Column(name = "senh_med", nullable = false)
    public String senha;

    @Column(name = "emai_med")
    public String email;

}
