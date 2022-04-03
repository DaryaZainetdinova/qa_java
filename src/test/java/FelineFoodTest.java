import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FelineFoodTest {
    private final String foodValue;

    public FelineFoodTest(String foodValue) {
        this.foodValue = foodValue;
    }

    @Parameterized.Parameters
    public static Object[][] getFoods() {
        return new Object[][]{
            {"Животные"},
            {"Птицы"},
            {"Рыба"},
        };
    }

    @Test
    public void checkEatMeat() throws Exception {
        Feline bagira = new Feline();
        assertTrue(bagira.eatMeat().contains(this.foodValue));
    }
}
