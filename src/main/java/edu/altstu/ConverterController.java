package edu.altstu;

import edu.altstu.entities.Currency;
import edu.altstu.services.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Евгений
 */
@Controller
public class ConverterController {
    
    @Autowired
    private ConverterService service;
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String defaultPage(Model model) {
        Currency currency1 = service.getCurrency(1),
                currency2 = service.getCurrency(2);
        model.addAttribute("curr1", currency1);
        model.addAttribute("curr2", currency2);
        model.addAttribute("comp", service.getComparation(currency1, currency2));
        return "HomePage";
    }
    
    public String getAnswer(Model model) {
        
    }
}
