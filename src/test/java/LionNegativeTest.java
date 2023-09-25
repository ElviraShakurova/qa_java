import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeTest {
    @Mock
    Feline feline;

    @Test
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion("Неизведанное существо", feline));
    }
}

