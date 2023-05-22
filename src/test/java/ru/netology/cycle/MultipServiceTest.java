package ru.netology.cycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipServiceTest {

    @Test
    void shouldSqrtCeil() {
        MultipService service = new MultipService();
        int num = 9;
        int expected = 3;

        int actual = service.sqrtCeil(num);

        assertEquals(expected, actual);
    }
}