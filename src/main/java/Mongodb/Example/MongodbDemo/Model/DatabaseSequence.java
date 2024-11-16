package Mongodb.Example.MongodbDemo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("database_sequence")
public class DatabaseSequence {

    @Id
    private String id;
    private long seq;
}
