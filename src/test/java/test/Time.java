package test;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverFactory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Time {

    public static String frequencyOfCharacters(String str){
        String res = "";
        while (str.length() != 0) {
            String let = str.substring(0,1);
            int c = str.length();
            str = str.replace(let, "");
            c -= str.length();
            res += let + c;
        }
        return res;
    }

    public static boolean sameLetters(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(a.substring(i,i+1))) return false;
            if (!a.contains(b.substring(i,i+1))) return false;
        }
        return true;
    }

    public static String removeDuplicates(String str) {
        return Arrays.toString(Arrays.stream(str.split("")).distinct().toArray()).replaceAll("[, \\[\\]]", "");
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
        System.out.println(sameLetters("jbc", "cjb"));

        System.out.println(removeDuplicates("AABBCCDDSSJ"));


    }
}
