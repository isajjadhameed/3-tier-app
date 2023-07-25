package com.nisum.nisumuser.Service;

import com.nisum.nisumuser.model.User;

public interface UserService {
    User createUser(User user);
    User loginUser(String email, String password);
}
