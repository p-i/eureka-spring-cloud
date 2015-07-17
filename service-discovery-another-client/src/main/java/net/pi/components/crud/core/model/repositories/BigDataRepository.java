package net.pi.components.crud.core.model.repositories;

import net.pi.components.crud.core.model.documents.BigData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by oleg on 17/07/15.
 */
@RepositoryRestResource(collectionResourceRel = "big-data", path = "big-data")
public interface BigDataRepository extends CrudRepository<BigData, String> {}