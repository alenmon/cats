import com.cats.entity.Child;
import com.cats.entity.Dog;
import org.junit.jupiter.api.Test;

import static com.cats.entity.Wool.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void childTestWool() {
        Dog dog = new Dog();
        assertEquals(L, dog.wool);

        Child child = new Child();

        child.beardDog(dog, M);
        assertEquals(M, dog.wool);

        child.beardDog(dog, S);
        assertEquals(S, dog.wool);
    }

    @Test
    public void beardDogTest() {
        Dog dog = new Dog();
        Child child = new Child();
        dog.wool = M;

        assertThrows(IllegalArgumentException.class, () -> {
            child.beardDog(dog, L);
        });
    }

    @Test
    public void beardDogTest2() {
        Dog dog = new Dog();
        Child child = new Child();
        dog.wool = S;

        assertThrows(IllegalArgumentException.class, () -> {
            child.beardDog(dog, M);
        });
    }

    @Test
    public void beardDogTest3() {
        Dog dog = new Dog();
        Child child = new Child();
        dog.wool = S;

        assertThrows(IllegalArgumentException.class, () -> {
            child.beardDog(dog, L);
        });
    }
}