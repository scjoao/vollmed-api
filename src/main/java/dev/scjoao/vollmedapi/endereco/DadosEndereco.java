package dev.scjoao.vollmedapi.endereco;

public record DadosEndereco(
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf) {
}
