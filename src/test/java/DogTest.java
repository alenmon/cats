import com.cats.entity.Child;
import com.cats.entity.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    @Test
    public void woofTest() {
        assertEquals("woof", new Dog().woof());
    }

    @Test
    public void childTestColor() {
        Dog dog = new Dog();
        assertEquals("white", dog.color);

        Child child = new Child();

        child.paintDog(dog, "purple");
        assertEquals("purple", dog.color);

    }

    @Test
    public void childTestGroom() {
        Dog dog = new Dog();
        Child child = new Child();

        child.beardDog(dog, groom);
        assertEquals("S", dog.groom);
        assertEquals("M", dog.groom);
        assertEquals("L", dog.groom);

    }


}
