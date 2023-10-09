package com.rubenszaes.tshare.service;

import com.rubenszaes.tshare.model.User;
import com.rubenszaes.tshare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listarTodos() {
        return userRepository.findAll();
    }

    public User buscarPorId(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User atualizar(Long id, User user) {
        User userFound = buscarPorId(id);
        if (userFound != null)
            return userRepository.save(user);
        return user;
    }

    public void deletar(Long id) {
        userRepository.deleteById(id);
    }
}
