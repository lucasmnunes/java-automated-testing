package automated.testing.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final String GREETINGS_MESSAGE = "Hi, darling!";

    public String sayHello() {
        return GREETINGS_MESSAGE;
    }

}
