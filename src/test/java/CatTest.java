import com.cats.entity.Cat;
import com.cats.entity.Child;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void meowTest() {
        assertEquals("meow", new Cat().meow());
        assertEquals("meow", Cat.staticMeow());
        assertEquals("meow", new Cat().staticMeow());
    }

    @Test
    public void meowTest2() {
        String meow = "meow";
        assertEquals(meow, new Cat().meow());
        assertEquals(meow, Cat.staticMeow());
        assertEquals(meow, new Cat().staticMeow());
    }

    @Test
    public void meowTest3() {
        assertEquals("meow", new Cat().meow());
        assertEquals("meow", new Cat().meow());
    }

    @Test
    public void meowTest4() {
        Cat cat = new Cat();
        assertEquals("meow", cat.meow());
        assertEquals("meow", cat.meow());
        assertEquals("black", cat.color);
    }

    @Test
    public void meowTest5() {
        Cat cat = new Cat();
        assertEquals("black", cat.color);
        cat.color = "red";
        assertEquals("red", cat.color);
    }

    @Test
    public void childTest() {
        Cat cat = new Cat();
        assertEquals("black", cat.color);

        Child child = new Child();

        child.paintCat(cat, "red");
        assertEquals("red", cat.color);

        child.paintCat(cat, "blue");
        assertEquals("blue", cat.color);
    }
}