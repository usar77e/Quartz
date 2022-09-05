package com.quartz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.model.Usuario;
import com.quartz.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService userServ;
	
	@GetMapping("")
	public ResponseEntity<List<Usuario>> findAll(){
		return new ResponseEntity<>(userServ.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public @ResponseBody Usuario save(@RequestBody Usuario usuario) {
		return userServ.save(usuario);
	}
}
