package net.edigest.journalApp.journalRepo;

import net.edigest.journalApp.Entity.JournalEntry;
import net.edigest.journalApp.Entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, ObjectId>
{
    Users findByUserName(String username);

}

