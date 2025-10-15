package com.entornos.lunchuis.security;

import com.entornos.lunchuis.model.Usuario;
import com.entornos.lunchuis.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioRepository repo;

    public UserDetailsServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String code) throws UsernameNotFoundException {
        Usuario user = repo.findByCode(code)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return User.builder()
                .username(user.getCode()) // usamos 'code' como username
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}