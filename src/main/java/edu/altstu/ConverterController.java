package edu.altstu;

import edu.altstu.entities.Comparation;
import edu.altstu.entities.Currency;
import edu.altstu.services.ConverterService;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        List<Currency> currencies = service.getCurrencyies();
        model.addAttribute("currencies", currencies);
        model.addAttribute("value1", "");
        model.addAttribute("value2", "");
        return "HomePage";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/press")
            public String press(Model model,@RequestParam("cur1") Integer cur1, @RequestParam("cur2") Integer cur2) {
        model.addAttribute("value1", service.getCurrency(cur1).getIcon());
        model.addAttribute("value2", service.getCurrency(cur2).getIcon());
        return "HomePage";
    }
}
