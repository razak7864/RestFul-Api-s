package net.edigest.journalApp.controller;


import net.edigest.journalApp.Entity.JournalEntry;
import net.edigest.journalApp.Entity.Users;
import net.edigest.journalApp.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService service;

    @GetMapping
    public List<Users> getAllUsers()
    {
        return service.getAll();
    }

    @PostMapping
    public void create(@RequestBody Users user)
    {
        service.saveEntry(user);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<?> updateUser(@RequestBody Users user,@PathVariable String userName) {
        Users userInDb = service.findByUserName(userName);
    if(userInDb!=null)
    {
        userInDb.setUserName(user.getUserName());
        userInDb.setPassword(user.getPassword());
        service.saveEntry(userInDb);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}