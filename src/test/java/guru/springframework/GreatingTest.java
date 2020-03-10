package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {


    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inside Before Alllllll ...");

    }

    @BeforeEach
    void setUp() {
        System.out.println("Inside Before each ...");
        greeting= new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Inside After ...");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Inside After Alllllll ...");

    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {

        System.out.println(greeting.helloWorld("Atena"));
    }
}