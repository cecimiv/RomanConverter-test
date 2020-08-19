import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    public String toRoman(int num){
        if(num == 1){
            return "I";
        }


    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }
}
