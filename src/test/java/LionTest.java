import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(Parameterized.class)
public class LionTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Feline feline;


    private final String checkedSex;
    private final boolean expected;
    public LionTest(String checkedSex, boolean expected){
        this.checkedSex = checkedSex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void testLionWithParams() throws Exception{
        Lion lion = new Lion(checkedSex, new Feline());
        Boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLionKittens() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetFood()throws Exception{

        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", new Feline());
        List<String> actualFood = lion.getFood() ;
        assertEquals(expectedFood, actualFood);
        System.out.println("Ожидаемый результат: " + expectedFood);
        System.out.println("Фактический результат: " + actualFood);
    }

}
