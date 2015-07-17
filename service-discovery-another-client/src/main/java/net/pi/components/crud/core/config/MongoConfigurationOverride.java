package net.pi.components.crud.core.config;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by oleg on 17/07/15.
 */
@Configuration
@EnableMongoRepositories("net.pi.components.crud.core.model.repositories")
public class MongoConfigurationOverride extends AbstractMongoConfiguration {

    public Mongo mongo(){
        Fongo fongo = new Fongo("fongo");
        return fongo.getMongo();
    }

    @Override
    protected String getDatabaseName() {
        return "fongo";
    }


}
