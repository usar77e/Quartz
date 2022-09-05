package com.quartz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quartz.model.Usuario;
import com.quartz.repository.UsuarioRepository;
import com.quartz.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepo.findAll();
	}

	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario e) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(e);
	}

	@Override
	public Usuario update(Usuario e) {
		// TODO Auto-generated method stub
		return save(e);
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		usuarioRepo.deleteById(id);
		return true;
	}
	
}
