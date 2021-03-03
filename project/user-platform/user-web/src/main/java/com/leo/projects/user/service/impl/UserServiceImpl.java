package com.leo.projects.user.service.impl;

import com.leo.projects.user.domain.User;
import com.leo.projects.user.repository.InMemoryUserRepository;
import com.leo.projects.user.repository.UserRepository;
import com.leo.projects.user.service.UserService;

/**
 * @author leo
 * @date 2021-03-03 22:49
 */
public class UserServiceImpl implements UserService {

    private UserRepository repository = new InMemoryUserRepository();
    @Override
    public boolean register(User user) {
        return repository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
