package dev.scjoao.vollmedapi.controller;

import dev.scjoao.vollmedapi.medico.DadosCadastroMedico;
import dev.scjoao.vollmedapi.medico.Medico;
import dev.scjoao.vollmedapi.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dadosCadastroMedico){
        repository.save(new Medico(dadosCadastroMedico));
    }
}

