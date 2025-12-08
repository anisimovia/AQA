package lesson2;

import java.util.Locale;

public class removing_spaces {
    public static void main(String[] args) {
        String str1 = " привет,   в этой    строке лишние   пробелы.  ";
        String str2 = str1.trim().replaceAll("\\s+", " ");
                System.out.println(str2);
        }
    }
