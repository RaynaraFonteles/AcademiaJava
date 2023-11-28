package com.ufn.jpaBanco.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ufn.jpaBanco.Model.User;
import com.ufn.jpaBanco.Repository.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping()
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping()
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setName(email);
		userRepository.save(n);
		return "Saved";
	}
}
