/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.dao;


import assignment3.model.Quiz_question;
import java.util.List;

/**
 *
 * @author user
 */
public interface QuestDAO {
        
    public void addQuest(Quiz_question question);
    public List<Quiz_question> getAllQuestions();
    
}
