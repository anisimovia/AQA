package lesson2;

public class removing_spaces_2 {
    public static void main(String[] args) {
        String str = " Привет  в этой  строке лишние  пробелы. ";
        int indexOfNewWord = 0;
        int indexFirst = 0;
        int indexLast = str.length();
        StringBuilder builder = new StringBuilder();
        if(str.length() > 1 && str.charAt(0) == ' ') {
            indexFirst = 1;
            builder.append(str.substring(indexFirst, str.length()));
        } else {
            builder.append(str);
        }
        String str2 = builder.toString();
        builder = new StringBuilder();

        if(str2.length() > 1 && str2.charAt(str2.length() - 1) == ' ') {
            indexLast = str2.length() - 1;
            builder.append(str2.substring(0, indexLast));
        }
        String str3 = builder.toString();
        builder = new StringBuilder();

        for(int i = 0; i < str3.length(); i++){
            if(str3.length() > i + 1 && str3.charAt(i) == ' ' && str3.charAt(i + 1) == ' ') {
                builder.append(str3.substring(indexOfNewWord, i));
                indexOfNewWord = i + 1;
            }
        }
        builder.append(str3.substring(indexOfNewWord, str3.length()));
        System.out.println(builder.toString());
    }
}
