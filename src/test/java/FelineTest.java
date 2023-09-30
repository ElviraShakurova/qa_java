import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;

import static org.junit.Assert.assertEquals;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        Feline newFeline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = newFeline.eatMeat();
        assertEquals(expectedFood, actualFood);

    }
    @Test
    public void testGetFamily() {
        Feline newFeline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = newFeline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }
    @Test
    public void testGetKittens(){
        Feline newFeline = new Feline();
        int expected = 1;
        int actual = newFeline.getKittens();
        assertEquals(expected, actual);
    }
    @Test
    public void testFelineKittensCount(){
        Feline newFeline = new Feline();
        int expectedKittensCount = 8;
        int actualKittensCount = newFeline.getKittens(8);
        assertEquals(expectedKittensCount,actualKittensCount);
    }
    @Test
    public void testFelineKittensInvokeTimes(){
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}