/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.model;

/**
 *
 * @author user
 */
import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private int id;
   
    private String title;
    
    private String description;
    
    private int marks;


     @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "quiz_questions", joinColumns = {
    @JoinColumn(name = "quiz_id")}, inverseJoinColumns = {
    @JoinColumn(name = "question_id")})
    private Set<Quiz_question> questions;
    
    public Set<Quiz_question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Quiz_question> questions) {
        this.questions = questions;
    }
    
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    
    
}
