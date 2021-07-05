import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.BDDMockito.*;
import org.mockito.MockitoAnnotations;

public class Task3Test {

    @Mock
    UserInput userInput;
    Output output;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        output = new Output();
    }
    
    @Test
    public void shouldReturnLengthIs16When16IsEntered() {
        given(userInput.chosenType( 2)).willReturn(16);
        String result = output.requiredOutput(16);
        assertEquals("The length is: 16",  result);
    }

    @Test
    public void shouldReturn8() {
        given(userInput.chosenType( anyInt())).willReturn(8);
        String result = output.requiredOutput(8);
        assertEquals("The length is: 8",  result);
    }

}
