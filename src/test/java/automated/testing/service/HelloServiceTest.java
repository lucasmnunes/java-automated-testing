package automated.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {

    HelloService service;

    @BeforeEach
    public void setup() {
        this.service =  new HelloService();
    }

    @Test
    public void whenSayHello_thenReturnGreetingsMessage() {
        Assertions.assertEquals("Hi, darling!", service.sayHello());
    }

}
