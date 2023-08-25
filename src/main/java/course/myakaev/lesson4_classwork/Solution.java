package course.myakaev.lesson4_classwork;

public class Solution {
    public String solution(String T) {
        double doubleT;
        try {
           doubleT = Double.parseDouble(T);
        } catch (NumberFormatException e) {
            return "Wrong format of temperature";
        }
        if (doubleT < 34.0) {
            return "Below the temperature range";
        }
        if (doubleT < 35.0) {
            return "hypothermia";
        }
        if (doubleT <= 37.5) {
            return "normal";
        }
        if (doubleT <= 40.0) {
            return "fever";
        }
        if (doubleT <= 42.0) {
            return "hyperpyrexia";
        } else {
            return "Above the temperature range";
        }
    }
}

