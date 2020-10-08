package br.com.dbserver.desafioacademiadbbackend.rest;

import br.com.dbserver.desafioacademiadbbackend.dto.request.AtendimentoRequest;
import br.com.dbserver.desafioacademiadbbackend.dto.response.AtendimentoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoRest {

    @PostMapping("/")
    public ResponseEntity<AtendimentoResponse> iniciarAtendimento(@RequestBody AtendimentoRequest atendimentoRequest) {
        AtendimentoResponse atendimentoResponse = AtendimentoResponse.builder().codigoAtendimento(1).build();
        return ResponseEntity.ok(atendimentoResponse);
    }

}
