package com.example.junittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationCheck {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$", Pattern.CASE_INSENSITIVE);

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&*^%]).{6,}$");
    static public boolean isCorrectEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.find();
    }
    static public boolean isCorrectPassword(String password) {
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.find();
    }

    static public boolean isPasswordMatches(String password1, String password2) {
        return (password1.equals(password2));
    }

}
