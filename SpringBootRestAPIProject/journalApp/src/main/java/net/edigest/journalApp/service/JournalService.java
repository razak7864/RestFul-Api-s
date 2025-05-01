package net.edigest.journalApp.service;

import net.edigest.journalApp.Entity.JournalEntry;
import net.edigest.journalApp.journalRepo.JouranlRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Component
public class JournalService {


    @Autowired
    private JouranlRepository repo;


    public List<JournalEntry> getAll()
    {
        return repo.findAll();
    }

    public void saveEntry(JournalEntry journalEntry)
    {
        repo.save(journalEntry);
    }



    public Optional<JournalEntry> findById(ObjectId id)
    {
        return repo.findById(id);
    }

    public void deleteById(ObjectId id)
    {
        repo.deleteById(id);
    }



}
