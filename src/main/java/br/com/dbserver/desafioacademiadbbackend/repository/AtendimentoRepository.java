package br.com.dbserver.desafioacademiadbbackend.repository;

import br.com.dbserver.desafioacademiadbbackend.entity.AtendimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Long> {
}
