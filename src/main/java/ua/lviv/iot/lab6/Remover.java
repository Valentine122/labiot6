package ua.lviv.iot.lab6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remover {

    public String removeWords(final StringBuilder text) {

        Pattern articlePattern = Pattern
                .compile("\"[a-z]*\"+\"[1-9,-]+\"+\"[a-z]*\"");
        Matcher matcher = articlePattern.matcher(text);
        System.out.println(matcher.replaceAll(""));
        return matcher.replaceAll("");

    }

}