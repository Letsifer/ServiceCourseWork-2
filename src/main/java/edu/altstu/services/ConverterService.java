package edu.altstu.services;

import edu.altstu.entities.Comparation;
import edu.altstu.entities.Currency;
import java.util.List;

/**
 *
 * @author Евгений
 */
public interface ConverterService {
    
    Currency getCurrency(Integer id);
    
    Comparation getComparation(Currency c1, Currency c2);
    
    List<Currency> getCurrencyies();
    
    List<Comparation> getAllComparations();
    
    List<Comparation> getCurrenciesComparations(Currency currency);
}
