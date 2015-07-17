package net.pi.components.crud.core.model.documents;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by oleg on 17/07/15.
 */
@Configurable
@Document(collection = "big-data")
public class BigData  {

    @Id
    protected String id;

    public String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}