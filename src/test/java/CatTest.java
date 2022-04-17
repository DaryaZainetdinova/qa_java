import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkFood() throws Exception {
        Cat cat = new Cat(this.feline);

        List<String> mockFood = List.of("Кошачий корм");
        Mockito.when(this.feline.eatMeat()).thenReturn(mockFood);

        List<String> value = cat.getFood();
        assertTrue(value.contains("Кошачий корм"));
    }

    @Test
    public void checkSound() {
        Cat cat = new Cat(this.feline);
        assertEquals("Мяу", cat.getSound());
    }
}
