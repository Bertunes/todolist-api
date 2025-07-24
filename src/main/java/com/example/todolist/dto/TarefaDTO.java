package com.example.todolist.dto;

import jakarta.validation.constraints.NotBlank;

public record TarefaDTO(
        @NotBlank String titulo,
        String descricao
) {}
