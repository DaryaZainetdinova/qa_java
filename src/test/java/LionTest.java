import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void checkFood() throws Exception {
        Lion leo = new Lion("Самец", this.feline);

        List<String> mockFood = List.of("Кошачий корм");
        Mockito.when(this.feline.getFood("Хищник")).thenReturn(mockFood);

        List<String> value = leo.getFood();
        assertTrue(value.contains("Кошачий корм"));
    }

    @Test
    public void checkKittens() throws Exception {
        Lion leo = new Lion("Самец", this.feline);

        Mockito.when(this.feline.getKittens()).thenReturn(9);
        assertEquals(9, leo.getKittens());
    }

    @Test
    public void checkMale() throws Exception {
        Lion leo = new Lion("Самец", this.feline);
        assertTrue(leo.doesHaveMane());
    }

    @Test
    public void checkFemale() throws Exception {
        Lion leo = new Lion("Самка", this.feline);
        assertFalse(leo.doesHaveMane());
    }

    @Test
    public void checkUnexpectedGender() {
        boolean thrown = false;

        try {
            Lion leo = new Lion("Транс", this.feline);
        } catch (Exception e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
}
