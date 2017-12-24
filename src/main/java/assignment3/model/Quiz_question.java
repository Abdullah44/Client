/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
@Table(name= "question")
public class Quiz_question implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Type;
    private String question;
    private String answer;
    
    
    
    public Quiz_question() {
    }
    
    public Quiz_question(String Type, String question, String answer) {
        this.Type = Type;
        this.question = question;
        this.answer = answer;
        
    }

    
    
    
    

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
 
 
}
