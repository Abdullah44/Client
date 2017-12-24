/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.service;

import assignment3.dao.QuestDAO;
import assignment3.model.Quiz_question;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service
@Transactional
public class QuestServiceImpl implements QuestService {
    @Autowired
    private QuestDAO questDAO;

    @Override
    @Transactional
    public void addQuest(Quiz_question question) {
        questDAO.addQuest(question); 
    }

    @Override
    @Transactional
    public List<Quiz_question> getAllQuestions() {
        return questDAO.getAllQuestions();
    }
    
}

