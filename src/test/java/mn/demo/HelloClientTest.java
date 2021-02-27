package mn.demo;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class HelloClientTest {

    @Inject
    HelloClient client;

    @Test
    public void testHello() {
        assertEquals("hello!", client.hello().blockingGet());
    }
}