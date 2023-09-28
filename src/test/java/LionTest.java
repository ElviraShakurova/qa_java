import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LionTest {

    private Feline feline;

    @Before
    public void setup() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void testGetLionKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", feline);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
        System.out.println("Ожидаемый результат: " + expectedFood);
        System.out.println("Фактический результат: " + actualFood);
    }
}