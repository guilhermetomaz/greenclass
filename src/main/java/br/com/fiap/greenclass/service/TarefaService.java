package br.com.fiap.greenclass.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.greenclass.model.Tarefa;
import br.com.fiap.greenclass.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repository;

	public List<Tarefa> findAll() {
		return repository.findAll();
	}

	public Optional<Tarefa> findById(Long id) {
		return repository.findById(id);
	}

	public Tarefa save(Tarefa tarefa) {
		return repository.save(tarefa);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
