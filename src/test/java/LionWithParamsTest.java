import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionWithParamsTest {

    private final String checkedSex;
    private final boolean expected;
    public LionWithParamsTest(String checkedSex, boolean expected){
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


}
