import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    private String toRoman(int i){
        String result = "I";
        if(i==2){
            result =  "II";
        }else if(i==3){
            result =  "III";
        }
        return result;
        }

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }
    @Test
    void shouldConvert2ToII(){
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3ToI(){
        assertEquals("III", toRoman(3));
    }
}
