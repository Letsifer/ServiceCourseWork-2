package edu.altstu;

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
        return "HomePage";
    }
}
