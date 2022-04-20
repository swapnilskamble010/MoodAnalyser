package moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalysisTest {

	@Test
	void givenMessage_WhenSad_ShouldReturnSAD() {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain("I am in Sad Mood");
		String mood = moodanalyser.analyseMood();
		Assertions.assertEquals("SAD", mood);
	}
	
	@Test
	void givenMessage_WheninAnyMood_ShouldReturnHAPPY() {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain("I am in Happy Mood");
		String mood = moodanalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}

}
