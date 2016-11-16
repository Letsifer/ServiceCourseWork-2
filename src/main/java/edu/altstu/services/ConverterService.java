package edu.altstu.services;

import edu.altstu.entities.Comparation;
import edu.altstu.entities.Currency;
import java.util.List;

/**
 *
 * @author Евгений
 */
public interface ConverterService {
    List<Currency> getCurrencyies();
    
    List<Comparation> getAllComparations();
    
    List<Comparation> getCurrenciesComparations(Currency currency);
}
