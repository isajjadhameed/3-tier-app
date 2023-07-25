package com.nisum.nisumuser.Service.Impl;

import com.nisum.nisumuser.Service.UserService;
import com.nisum.nisumuser.model.User;
import com.nisum.nisumuser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {

        User loggedInUser  = userRepository.findByEmailAndPassword(email, password);
            if (loggedInUser == null || !loggedInUser.getPassword().equals(password) || !loggedInUser.getEmail().equals(email)) {
                throw new IllegalArgumentException("Invalid credentials");
            }
            return loggedInUser;
    }
        }
