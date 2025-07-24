package com.example.todolist.service;

import com.example.todolist.dto.TarefaDTO;
import com.example.todolist.model.Tarefa;
import com.example.todolist.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repo;

    public TarefaService(TarefaRepository repo) {
        this.repo = repo;
    }

    public List<Tarefa> listarTodas() {
        return repo.findAll();
    }

    public Tarefa salvar(TarefaDTO dto) {
        var tarefa = new Tarefa(null, dto.titulo(), dto.descricao(), false);
        return repo.save(tarefa);
    }
}
