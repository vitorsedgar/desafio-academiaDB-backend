package br.com.dbserver.desafioacademiadbbackend.dto.request;

import lombok.Data;

@Data
public class IniciarAtendimentoRequest {

    private String codigoMedico;

    private int codigoUnidade;

    private String nomePaciente;

    private String documentoPaciente;

}