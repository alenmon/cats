import org.junit.jupiter.api.Test;

import static com.cats.CatsCounter.calculateCats;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {
    @Test
    public void calculateCatsTest() {
        assertEquals(5, calculateCats(2, 3));
    }

    @Test
    public void calculateCatsTest2() {
        assertEquals(9, calculateCats(4, 5));
    }

    @Test
    public void calculateCatsTest3() {
        assertEquals(9, calculateCats(4, 4));
    }

    @Test
    public void calculateCatsTest4() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculateCats(1000, 1001);
        });
    }
}