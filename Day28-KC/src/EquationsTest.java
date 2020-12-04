import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {

    @org.junit.jupiter.api.Test
    void areaOfRectangle() {
        assertEquals(50.0,Equations.areaOfRectangle(5,10.0));
    }

    @org.junit.jupiter.api.Test
    void areaOfTriangle() {
        assertEquals(150,Equations.areaOfTriangle(10,15));
    }

    @org.junit.jupiter.api.Test
    void circumferenceOfSphere() {
        assertEquals(250,Equations.circumferenceOfSphere(12));
    }
}