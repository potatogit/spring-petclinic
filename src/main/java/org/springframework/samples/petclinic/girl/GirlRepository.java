package org.springframework.samples.petclinic.girl;

import org.springframework.data.repository.Repository;

/**
 * Repository class for <code>Girl</code> domain objects All method names are compliant with Spring Data naming
 * conventions so this interface can easily be extended for Spring Data See here: http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 * @author Yang Yumeng
 */
public interface GirlRepository extends Repository<Girl, Integer> {
    /**
     * Save an {@link Girl} to the data store, either inserting or updating it.
     * @param girl the {@link Girl} to save
     */
    void save(Girl girl);

}
