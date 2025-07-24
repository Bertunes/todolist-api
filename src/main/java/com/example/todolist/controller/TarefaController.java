package com.example.todolist.controller;

import com.example.todolist.dto.TarefaDTO;
import com.example.todolist.model.Tarefa;
import com.example.todolist.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public ResponseEntity<Tarefa> cadastrar(@RequestBody @Valid TarefaDTO dto) {
        var salva = service.salvar(dto);
        return ResponseEntity.status(201).body(salva);
    }
}
