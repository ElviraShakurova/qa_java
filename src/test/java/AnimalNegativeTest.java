import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnimalNegativeTest {
    @Mock
    Animal animal;

    @Test
    public void setAnimalError() throws Exception {
        when(animal.getFood("нечто")).thenThrow(new Exception());
        assertThrows(Exception.class, () -> animal.getFood("нечто"));
    }
    @Test
    public void testExceptionTextAnimal(){
        try {
            Animal animal = new Animal();
            animal.getFood("Нечто");
        } catch (Exception e) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}

