package com.task.Gerenciamento_Tarefas.Repositories;

import com.task.Gerenciamento_Tarefas.Models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}