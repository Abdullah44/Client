/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.controller;

/**
 *
 * @author user
 */
import assignment3.model.Quiz;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import assignment3.model.Users;
import assignment3.service.QuizService;
import assignment3.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger logger = Logger
            .getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    @Autowired
    private QuizService quizService;
    
    
    /*@RequestMapping(value = "/")
    public ModelAndView listUser(ModelAndView model) throws IOException {
		List<Users> listUsers = userService.getAllUsers();
		model.addObject("listUsers", listUsers);
		model.setViewName("home");
		return model;
	}*/
    @RequestMapping(value = "/")
    @ResponseBody
    public List<Users> listUser() throws IOException {
        List<Users> listUsers = userService.getAllUsers();
        return listUsers;
    }
    

    
    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model) {
        Users user = new Users();
        model.addObject("user", user);
        model.setViewName("SignUp");
        return model;
    }
    
    
    /*
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute Users user) {
        userService.addUser(user);
        return new ModelAndView("redirect:/");
    }*/
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST,  headers = "Accept=application/json")
    public void addUser (@RequestBody Users user) {
        userService.addUser(user);
        
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public Users getUser (@RequestParam(value = "username") String Login) {
        Users newuser = userService.getUser(Login);
        return newuser;
        
        
    }
    
    @RequestMapping(value ="/newquiz", method = RequestMethod.GET)
    public ModelAndView newQuiz(ModelAndView model) {
        Quiz quiz = new Quiz();
        model.addObject("quiz", quiz);
        model.setViewName("newquiz");
        return model;
    }
    
   
    
}
