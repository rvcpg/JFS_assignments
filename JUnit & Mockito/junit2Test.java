package junit2;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit2Test {

	int a = 50;
    int b = 10;
    @BeforeAll
    static void printd(){
        System.out.println("before all executed");
    }
    @AfterEach
    void printc(){
        System.out.println("after each executed");
    }
    @AfterAll
    static void printall(){
        System.out.println("It's done");
    }
    @BeforeEach
    void setUp() {
        System.out.println("before each executed");
    }
    @Test
    void add() {
        assertEquals(60,junit2.add(a,b));
    }

    @Test
    void sub() {
        assertEquals(500,junit2.mul(a,b));

    }
}
	
