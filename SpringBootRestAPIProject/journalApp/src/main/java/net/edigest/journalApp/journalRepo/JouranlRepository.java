package net.edigest.journalApp.journalRepo;

import net.edigest.journalApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface JouranlRepository extends MongoRepository<JournalEntry, ObjectId>
{

}

