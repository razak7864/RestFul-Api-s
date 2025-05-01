package net.edigest.journalApp.service;

import net.edigest.journalApp.Entity.JournalEntry;
import net.edigest.journalApp.Entity.Users;
import net.edigest.journalApp.journalRepo.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UsersService {

@Autowired
   private UserRepository repo;

    public List<Users> getAll()
    {
        return repo.findAll();
    }

    public void saveEntry(Users user)
    {
        repo.save(user);
    }

public Users findByUserName(String username)
{
    return repo.findByUserName(username);
}

    public Optional<Users> findById(ObjectId id)
    {
        return repo.findById(id);
    }

    public void deleteById(ObjectId id)
    {
        repo.deleteById(id);
    }



}
