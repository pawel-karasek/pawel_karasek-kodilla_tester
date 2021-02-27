package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {
            "pawel", // małe litery
            "PAWEL", // wielkie litery
            "paw", // minimalna liczba znaków
            "-pawel", // myślnik na początku
            "_pawel", // podkreślenie na początku
            "123456", // same cyfry
            "...."}) // same znaki
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "#$%", // znaki specjalne
            "Pa wel", // spacja
            "p", // mniejsza liczba znaków niż wymagana
            "", // pusty username
            "paweł", // polski znak diaktryczny
            "    "}) // same spacje
    public void shouldReturnFalseIfUsernameIsIncorrect(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "pawel.karasek@kodilla.pl",
            "pawel@kodilla.net",
            "pawel@urzad.gov.pl",
            "PaWeL@kodilla.pl",
            "pawel123@kodilla123.biz",
            "pawel_123@kodilla.pl",
            "123pawel@kodilla.eu"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "pawel.kodilla.eu", // brak "@"
            "@kodilla.pl", // brak części przed "@"
            "pawel@kodilla", // błędna domena
            "pawel@kodilla.", // błędna domena
            "pawel@_kodilla.pl", // podkreślenie na początku domeny
            "pawel@pióro.gov"}) // polski znak diaktryczny
    public void shouldReturnFalseIfEmailIsIncorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "-pawel@kodilla.pl", // myślnik na początku
            "_pawel@kodilla.net", // podkreślenie na początku
            "pawel@-kodilla.biz"}) // myślnik na początku domeny
    public void shouldReturnFalseIfEmailIsIncorrectButReturnTrue(String email) {
        assertTrue(userValidator.validateEmail(email));
    }


    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}