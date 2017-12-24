/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.dao;

/**
 *
 * @author user
 */
import java.util.*;
import assignment3.model.Users;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOimpl implements UserDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
     this.sessionFactory = sessionFactory;
  }

    @Override
    public void addUser(Users user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user); 
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Users> getAllUsers() {
       return sessionFactory.getCurrentSession().createQuery("FROM Users").getResultList();
    }

   @Override
   public Users getUser(String login)
   {
        List<Users> userList = new ArrayList<Users>();
        Query query = sessionFactory.openSession().createQuery("FROM Users where username = :login");
        query.setParameter("login", login);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;    
    }
   
    
}
