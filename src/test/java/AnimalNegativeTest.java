import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class AnimalNegativeTest {

    @Test
    public void setAnimalError() {
        Animal animal = new Animal();
        assertThrows(Exception.class, () -> animal.getFood("нечто"));
    }
}

