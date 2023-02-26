package com.mg.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mg.projeto.DAO.IReserva;
import com.mg.projeto.model.Reserva;

@RestController
@CrossOrigin("*")
@RequestMapping("/reserva")
public class ReservaController{
	
	@Autowired
	private IReserva dao;
	
	@GetMapping
	public List<Reserva> listaReserva () {
		return (List<Reserva>) dao.findAll();
	}

	@PostMapping
	public Reserva criarReserva (@RequestBody Reserva reserva) {
		Reserva reservaNova = dao.save(reserva);
		return reservaNova;
	}
	
	@PutMapping
	public Reserva editarReserva (@RequestBody Reserva reserva) {
		Reserva reservaNova = dao.save(reserva);
		return reservaNova;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Reserva> excluirReserva(@PathVariable Integer id) {
		Optional<Reserva> reserva = dao.findById(id);
		dao.deleteById(id);
		return reserva;
	}
	
}
