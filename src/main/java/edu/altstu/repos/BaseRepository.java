package edu.altstu.repos;

/**
 *
 * @author Евгений
 */ 

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends Object, PK extends Serializable> extends JpaRepository<T, PK>, QueryDslPredicateExecutor<T> {

}
