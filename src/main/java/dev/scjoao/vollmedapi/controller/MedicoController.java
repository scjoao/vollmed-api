package dev.scjoao.vollmedapi.controller;

import dev.scjoao.vollmedapi.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dadosCadastroMedico){
        System.out.println(dadosCadastroMedico);
    }
}

