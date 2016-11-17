package edu.altstu.services;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import edu.altstu.entities.Comparation;
import edu.altstu.entities.Currency;
import edu.altstu.entities.QComparation;
import edu.altstu.repos.ComparationRepository;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.altstu.repos.CurrencyRepository;

/**
 *
 * @author Евгений
 */
@Service
public class ConverterServiceImpl implements ConverterService {

    @Autowired
    private CurrencyRepository currencyRepository;
    
    @Autowired
    private ComparationRepository comparationRepository;
    
    @Autowired
    private EntityManager entityManager;
    
    @Override
    public List<Currency> getCurrencyies() {
        return currencyRepository.findAll();
    }

    @Override
    public List<Comparation> getCurrenciesComparations(Currency currency) {
        QComparation comparation = QComparation.comparation;
        BooleanExpression expression = comparation.first().id.eq(currency.getId());
        expression = expression.or(comparation.second().id.eq(currency.getId()));
        return new JPAQuery<>(entityManager)
                .select(comparation)
                .from(comparation)
                .where(expression)
                .fetch();
    }

    @Override
    public List<Comparation> getAllComparations() {
        return comparationRepository.findAll();
    }

    @Override
    public Currency getCurrency(Integer id) {
        return currencyRepository.findOne(id);
    }

    @Override
    public Comparation getComparation(Currency c1, Currency c2) {
        QComparation comparation = QComparation.comparation;
        BooleanExpression expression = comparation.first().id.eq(c1.getId()).and(comparation.second().id.eq(c2.getId()));
        expression = expression.or(comparation.first().id.eq(c2.getId()).and(comparation.second().id.eq(c1.getId())));
        return new JPAQuery<>(entityManager)
                .select(comparation)
                .from(comparation)
                .where(expression)
                .fetchOne();
    }
}
