package com.kodilla.collections.adv.exercise.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testAddWord() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishword = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        // when
        dictionary.addWord(polishword, englishWord);
        // then
        assertEquals(1, dictionary.size());
    }
    @Test
    public void findEnglishWord() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        assertEquals(expectedList, result);
    }
    @Test
    public void findEnglishWords_withPartOfSpeech() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
    }
}