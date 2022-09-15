package com.carlos.userpost.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.userpost.domain.User;
import com.carlos.userpost.dtos.UserDTO;
import com.carlos.userpost.repositories.UserRepository;
import com.carlos.userpost.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Transactional
	public List<User> findAll() {
		return repository.findAll();
	}

	@Transactional
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	@Transactional
	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
