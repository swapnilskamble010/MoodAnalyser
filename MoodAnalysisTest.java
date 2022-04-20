package moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalysisTest {

	@Test
	void givenMessage_WhenSad_ShouldReturnSAD() {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain();
		String mood = moodanalyser.analyseMood("I am in Sad Mood");
		Assertions.assertEquals("SAD", mood);
	}
	
	@Test
	void givenMessage_WheninAnyMood_ShouldReturnHAPPY() {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain();
		String mood = moodanalyser.analyseMood("I am in Any Mood");
		Assertions.assertEquals("HAPPY", mood);
	}

}
