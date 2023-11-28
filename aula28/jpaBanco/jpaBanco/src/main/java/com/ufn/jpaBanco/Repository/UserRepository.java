package com.ufn.jpaBanco.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ufn.jpaBanco.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
