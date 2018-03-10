package guru.springframework.joke.service;
import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class GetQuoteServiceImpl implements GetQuoteService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public GetQuoteServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
