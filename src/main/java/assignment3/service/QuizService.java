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
import assignment3.model.Quiz;

public interface QuizService {
    
    public void addQuiz(Quiz quiz);
    public List<Quiz> getAllQuizzes();
}
