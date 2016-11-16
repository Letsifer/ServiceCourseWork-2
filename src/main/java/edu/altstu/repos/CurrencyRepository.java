package edu.altstu.repos;

import edu.altstu.entities.Currency;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Евгений
 */
@Repository
public interface CurrencyRepository extends BaseRepository<Currency, Integer>{
    
}
