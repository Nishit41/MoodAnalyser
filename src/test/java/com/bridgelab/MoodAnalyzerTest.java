package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("i am in Sad mood");
        String mood = moodAnalyzer.analyseMood( );
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" i am in Happy mood");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }
}
