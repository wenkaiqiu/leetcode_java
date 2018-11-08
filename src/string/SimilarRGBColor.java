package string;

public class SimilarRGBColor {
    public String similarRGB(String color) {
        return "#"+f(color.substring(1,3))+ f(color.substring(3, 5)) + f(color.substring(5));
    }
    public String f(String hex){
        int n = Integer.valueOf(hex,16);
        n = n / 17 +(n % 17 > 8 ? 1 : 0);
        return String.format("%02x", 17*n);
    }
}
