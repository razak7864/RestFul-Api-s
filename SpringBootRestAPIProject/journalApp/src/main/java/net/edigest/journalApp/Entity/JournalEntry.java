package net.edigest.journalApp.Entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document (collection = "journal_entries")
@Getter
@Setter
public class JournalEntry {
//POJO class
    @Id
    private ObjectId id;
@NonNull
    private String title;

    private String content;

    private LocalDateTime date;
/* Insted of using Getters & Setters we are using Lombok->>
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date)
    {
        this.date=date;
    }

    public ObjectId getId()
    {
        return id;
    }

    public void setId(ObjectId id)
    {
        this.id=id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

 */
}
