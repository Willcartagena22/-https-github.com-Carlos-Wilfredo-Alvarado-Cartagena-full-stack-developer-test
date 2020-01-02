package com.hugo.test.oauth.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hugo.test.oauth.clients.UsuarioFeignClient;
import com.hugo.test.usuarioscommons.entity.Usuario;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UsuarioFeignClient cli;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usu =cli.findByUsername(username);
		
		if (usu==null) {
			
			throw new UsernameNotFoundException("Error, el usuario no esta registrado");
		}
		
		List<GrantedAuthority> auth = usu.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.collect(Collectors.toList());
		return new User(usu.getUsername(), usu.getPassword(), usu.getEnabled(), true, 
				true, true, auth);
	}

}
