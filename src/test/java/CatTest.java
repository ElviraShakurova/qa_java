import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    @Test
    public void testGetSound() {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testGetFood()throws Exception{
        List<String> expectedFood = Arrays.asList("Хищник", "Животные");
        when(feline.eatMeat()).thenReturn(expectedFood);
        Cat cat = new Cat(feline);
        List<String> actualFood = cat.getFood() ;
        assertEquals(expectedFood, actualFood);


    }
}
