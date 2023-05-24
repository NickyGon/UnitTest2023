package basic;

import org.junit.jupiter.api.*;

public class BasicUnitTest {

    // antes de todos los tests
    @BeforeAll
    public static void beforeClass(){
        System.out.println("beforeAll");
    }

    // despues de todos los tests
    @AfterAll
    public static void AfterClass(){
        System.out.println("afterAll");
    }

    //Cada vez que se ejecute un test, se ejecuta este setup
    @BeforeEach
    public void setup(){
        System.out.println("setup");
    }

    // Despues de cada test
    @AfterEach
    public void cleanup(){
        System.out.println("cleanup");
    }

    // unit test / integration test / UI test
    @Test
    public void verifySomething(){
        // actions or steps
        // verification
        System.out.println("Test1");
        Assertions.assertTrue(2==2, "Error la suma esta incorrecta verifique el metodo de suma");
    }

    @Test
    public void verifySomething2(){
        System.out.println("Test2");
    }
}
