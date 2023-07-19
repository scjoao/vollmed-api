package dev.scjoao.vollmedapi.medico;

import dev.scjoao.vollmedapi.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
