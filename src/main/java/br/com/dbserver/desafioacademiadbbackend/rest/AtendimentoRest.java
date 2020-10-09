package br.com.dbserver.desafioacademiadbbackend.rest;

import br.com.dbserver.desafioacademiadbbackend.dto.request.IniciarAtendimentoRequest;
import br.com.dbserver.desafioacademiadbbackend.dto.request.LiberarPacienteRequest;
import br.com.dbserver.desafioacademiadbbackend.dto.response.IniciarAtendimentoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoRest {

    @PostMapping("/")
    public ResponseEntity<IniciarAtendimentoResponse> iniciarAtendimento(@RequestBody IniciarAtendimentoRequest iniciarAtendimentoRequest) {
        IniciarAtendimentoResponse atendimentoResponse = IniciarAtendimentoResponse.builder().codigoAtendimento(1).build();
        return ResponseEntity.ok(atendimentoResponse);
    }

    @PostMapping("/liberar")
    public ResponseEntity liberarPaciente(@RequestBody LiberarPacienteRequest liberarPacienteRequest) {
        return ResponseEntity.ok().build();
    }

}
