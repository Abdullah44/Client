/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.service;

/**
 *
 * @author user
 */
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import assignment3.dao.UserDAO;
import assignment3.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void addUser(Users user) {
        userDAO.addUser(user); 
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return userDAO.getAllUsers();
    }
    
    @Override
    @Transactional
    public Users getUser(String login)
    {
        return userDAO.getUser(login);
    }
    
    
}
