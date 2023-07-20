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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nome;
    private String crm;

    @Enumerated
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

}
