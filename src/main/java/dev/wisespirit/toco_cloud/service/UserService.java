package dev.wisespirit.toco_cloud.service;

import dev.wisespirit.toco_cloud.domains.AuthUser;
import dev.wisespirit.toco_cloud.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<AuthUser> findById(int id){
        return userRepository.findById(id);
    }

    public Optional<AuthUser> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<AuthUser> findAll(){
        return userRepository.findAll();
    }

    public AuthUser save(AuthUser user){
        return userRepository.save(user);
    }

    public AuthUser update(AuthUser user){
        return userRepository.save(user);
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }
}
