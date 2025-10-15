package com.entornos.lunchuis.service;

import com.entornos.lunchuis.model.Usuario;
import com.entornos.lunchuis.repository.UsuarioRepository;
import com.entornos.lunchuis.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String code, String password) throws Exception {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByCode(code);
        if (usuarioOpt.isEmpty()) {
            throw new Exception("Usuario no encontrado");
        }

        Usuario usuario = usuarioOpt.get();

        if (!passwordEncoder.matches(password, usuario.getPassword())) {
            throw new Exception("Contraseña incorrecta");
        }

        // usamos 'code' como subject del token
        return jwtUtil.generarToken(usuario.getCode());
    }
}