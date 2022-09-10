package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
       MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
       String mood = moodAnalyzer.analyserMood("i am in sad message");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    void givenMessage_WhenSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyserMood_When_Happy("i am in any mood");
        Assertions.assertEquals("Happy",mood);
    }






}
