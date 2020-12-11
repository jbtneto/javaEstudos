package br.neto.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.neto.spring02.model.Anuncio;

public interface AnuncioDao extends CrudRepository<Anuncio, Integer> {
    
}