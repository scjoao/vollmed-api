package dev.scjoao.vollmedapi.medico;

import dev.scjoao.vollmedapi.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    public Medico(DadosCadastroMedico dadosCadastroMedico) {
        this.nome = dadosCadastroMedico.nome();
        this.crm = dadosCadastroMedico.crm();
        this.email = dadosCadastroMedico.email();
        this.telefone = dadosCadastroMedico.telefone();
        this.especialidade = dadosCadastroMedico.especialidade();
        this.endereco = new Endereco(dadosCadastroMedico.endereco());
        this.ativo = true;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String crm;
    private String email;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    private boolean ativo;

    public void atualizarInformacoes(DadosAtualizacaoMedico dadosAtualizacaoMedico) {
        if (dadosAtualizacaoMedico.nome() != null){
            this.nome = dadosAtualizacaoMedico.nome();
        }
        if (dadosAtualizacaoMedico.telefone() != null){
            this.telefone = dadosAtualizacaoMedico.telefone();
        }
        if (dadosAtualizacaoMedico.endereco() != null){
            this.endereco.atuaizarInformcoes(dadosAtualizacaoMedico.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
