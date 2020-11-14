package employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testCreateEmployeeToString() {

        //Given
        Employee employee = new Employee("Teszt Elek", "kéményseprő", 88000);

        //When

        //Then
        assertEquals("Teszt Elek - kéményseprő - 88000 Ft", employee.toString());
    }

    public void  testCreateEmployeeValidation() {

        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> new Employee("", "minőségellenőr", 520000));
        assertEquals("isEmpty!", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> new Employee("Kis Géza", null, 520000));
        assertEquals("isEmpty!", ex2.getMessage());

        Exception ex3 = assertThrows(IllegalArgumentException.class, () -> new Employee("Kis Géza", null, 520000));
        assertEquals("isEmpty!", ex3.getMessage());
    }
}
