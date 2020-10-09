package br.com.dbserver.desafioacademiadbbackend.entity;

import br.com.dbserver.desafioacademiadbbackend.enumeration.SituacaoAtendimentoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity(name = "Atendimento")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AtendimentoEntity {

    @Id
    @Column(name = "cod_ate")
    public long codigoAtendimento;

    @ManyToOne
    @JoinColumn(name = "cod_med")
    public MedicoEntity Medico;

    @ManyToOne
    @JoinColumn(name = "cod_uni")
    public UnidadeEntity codigoUnidade;

    @Column(name = "docu_pac", nullable = false)
    public String documentoPaciente;

    @Column(name = "nome_pac", nullable = false)
    public String nomePaciente;

    @Column(name = "sint_pac")
    public String sintomasPaciente;

    @Column(name = "dth_ini_ate", nullable = false)
    public LocalDateTime dataHoraInicioAtendimento;

    @Column(name = "dth_fim_ate")
    public LocalDateTime dataHoraFimAtendimento;

    @Column(name = "situ_pac")
    @Enumerated(EnumType.STRING)
    public SituacaoAtendimentoEnum situacaoAtendimento;
}
