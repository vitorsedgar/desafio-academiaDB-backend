package br.com.dbserver.desafioacademiadbbackend.dto.request;

import lombok.Data;

@Data
public class LiberarPacienteRequest {

    public int codigoAtendimento;

    public String sintomas;

}
