package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimilarRGBColorTest {

    @Test
    void similarRGB() {
        String input = "#09f166";
        String output = "#11ee66";
        assertEquals(new SimilarRGBColor().similarRGB(input), output);
    }
}