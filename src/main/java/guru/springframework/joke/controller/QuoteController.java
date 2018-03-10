package guru.springframework.joke.controller;

import guru.springframework.joke.service.GetQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
    private GetQuoteService getQuoteService;

    @Autowired
    public QuoteController(GetQuoteService getQuoteService) {
        this.getQuoteService = getQuoteService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        model.addAttribute("nextQuote", getQuoteService.getQuote());
        return "quote";
    }
}
