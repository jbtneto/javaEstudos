package br.neto.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.neto.spring02.model.User;

// CRUD - Create Read Update Delete
public interface UserDao extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
    
}
