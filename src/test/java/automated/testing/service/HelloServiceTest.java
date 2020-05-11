package automated.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class HelloServiceTest {

    @InjectMocks
    HelloService service;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenSayHello_thenReturnGreetingsMessage() {
        Assertions.assertEquals("Hi, darling!", service.sayHello());
    }

}
