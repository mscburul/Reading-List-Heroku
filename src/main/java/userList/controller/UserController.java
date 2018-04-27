package userList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import userList.entity.User;
import userList.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String usersTable(Model model){
        List<User> userList = userRepository.findAll();
        if (userList != null){
            model.addAttribute("users",userList);
        }
        return "userList";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String addToUsersList(User user){
        userRepository.save(user);
        return "redirect:/users";
    }
}
