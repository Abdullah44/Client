/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.dao;

import assignment3.model.Quiz_question;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class QuestDAOImpl implements QuestDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
     this.sessionFactory = sessionFactory;
  }

    @Override
    public void addQuest(Quiz_question question) {
        sessionFactory.getCurrentSession().saveOrUpdate(question); 
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Quiz_question> getAllQuestions() {
       return sessionFactory.getCurrentSession().createQuery("FROM Quiz_question").getResultList();
    }
}
