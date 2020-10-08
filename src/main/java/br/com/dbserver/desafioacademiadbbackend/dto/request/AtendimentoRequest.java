package br.com.dbserver.desafioacademiadbbackend.dto.request;

import lombok.Data;

@Data
public class AtendimentoRequest {

    private String codigoMedico;

    private int codigoUnidade;

    private String nomePaciente;

    private String documentoPaciente;

}