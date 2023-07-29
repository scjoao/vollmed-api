package dev.scjoao.vollmedapi.controller;

import dev.scjoao.vollmedapi.medico.DadosCadastroMedico;
import dev.scjoao.vollmedapi.medico.DadosListagemMedico;
import dev.scjoao.vollmedapi.medico.Medico;
import dev.scjoao.vollmedapi.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico){
        repository.save(new Medico(dadosCadastroMedico));
    }

    @GetMapping
    public List<DadosListagemMedico> listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}

