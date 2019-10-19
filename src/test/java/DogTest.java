import com.cats.entity.Child;
import com.cats.entity.Dog;
import com.cats.entity.Husky;
import org.junit.jupiter.api.Test;

import static com.cats.entity.Wool.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DogTest {
    @Test
    public void woofTest() {
        assertEquals("Husky barks", new Husky().dogBark());
    }

    @Test
    public void childTestColor() {
        Dog dog = new Husky();
        assertEquals("white", dog.getColor());

        Child child = new Child();

        child.paintDog(dog, "purple");
        assertEquals("purple", dog.getColor());

    }

    @Test
    public void childTestWool() {
        Dog dog = new Husky();
        assertEquals(L, dog.getWool());

        Child child = new Child();

        child.setWool(dog, M);
        assertEquals(M, dog.getWool());

        child.setWool(dog, S);
        assertEquals(S, dog.getWool());
    }

    @Test
    public void beardDogTest() {
        Dog dog = new Husky();
        Child child = new Child();
        dog.setWool(M);

        assertThrows(IllegalArgumentException.class, () -> {
            child.setWool(dog, L);
        });
    }

    @Test
    public void beardDogTest2() {
        Dog dog = new Husky();
        Child child = new Child();
        dog.setWool(S);

        assertThrows(IllegalArgumentException.class, () -> {
            child.setWool(dog, M);
        });
    }

    @Test
    public void beardDogTest3() {
        Dog dog = new Husky();
        Child child = new Child();
        dog.setWool(S);

        assertThrows(IllegalArgumentException.class, () -> {
            child.setWool(dog, L);
        });
    }
}