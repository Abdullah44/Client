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
import assignment3.model.Quiz;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDAOImpl implements QuizDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
     this.sessionFactory = sessionFactory;
  }

    @Override
    public void addQuiz(Quiz quiz) {
        sessionFactory.getCurrentSession().saveOrUpdate(quiz); 
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Quiz> getAllQuizzes() {
       return sessionFactory.getCurrentSession().createQuery("FROM Quiz").getResultList();
    }
}
