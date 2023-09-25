import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final List<String> expectedFood;
    public AnimalTest(String animalKind, List<String> expectedFood){
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void testAnimalWithParams() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        Assert.assertEquals(expectedFood, actual);
    }
    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}
