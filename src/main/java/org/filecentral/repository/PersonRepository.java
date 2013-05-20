package org.filecentral.repository;

import org.filecentral.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person> {

    
}
