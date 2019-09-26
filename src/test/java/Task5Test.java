import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.BDDMockito.*;
import org.mockito.MockitoAnnotations;

public class Task5Test {

    @Mock
    Calculations calculations;
    ConvertToBinary convertToBinary;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        convertToBinary = new ConvertToBinary();
    }

    @Test
    public void convertShouldReturn101When5IsEntered() {
        given(calculations.changeCharacterValue("111", 2)).willReturn(5);
        String result = convertToBinary.convert(5);
        assertEquals("101", result);
    }

    @Test
    public void convertShouldReturnOneWhenOneIsEntered() {
        given(calculations.changeCharacterValue("0", 1)).willReturn(1);
        String result = convertToBinary.convert(1);
        assertEquals("1", result);
    }

    @Test
    public void convertShouldReturnNegativeOneInBinary() {
        given(calculations.changeCharacterValue(anyString(), anyInt())).willReturn(-1);
        String result = convertToBinary.convert(-1);
        assertEquals("11111111111111111111111111111111", result);
    }
}
