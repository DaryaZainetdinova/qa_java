import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void checkGetFamily() {
        Feline bagira = new Feline();
        assertEquals("Кошачьи", bagira.getFamily());
    }

    @Test
    public void checkKittensCount() {
        Feline bagira = new Feline();
        assertEquals(1, bagira.getKittens());
    }

    @Test
    public void checkFoodCount() throws Exception {
        Feline bagira = new Feline();
        assertEquals(3, bagira.eatMeat().size());
    }
}
