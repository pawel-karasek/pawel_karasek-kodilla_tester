package com.kodilla.parametrized_tests.homework;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();
/*
    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers-happyPath.csv")
    public void shouldReturnHitNumbers(String userNumbers, String x) throws InvalidNumbersException{
        gamblingMachine.howManyWins(new HashSet<>());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers-fourNumbers.csv")
    public void shouldThrowExceptionFourNumbers(Set<Integer> userNumbers) throws InvalidNumbersException{
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(userNumbers));
        assertEquals("Wrong numbers provided.", exception);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers-numbersOutOfRange.csv")
    public void shouldThrowExceptionOutOfRange(Set<Integer> userNumbers) throws InvalidNumbersException{
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(userNumbers));
        assertEquals("Wrong numbers provided.", exception);
    }

 */
}