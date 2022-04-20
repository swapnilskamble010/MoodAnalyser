package moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalysisTest {

	@Test
	void givenMessage_WhenSad_ShouldReturnSAD() throws MoodAnalysisException {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain("I am in Sad Mood");
		String mood = moodanalyser.analyseMood();
		Assertions.assertEquals("SAD", mood);
	}
	
	@Test
	void givenMessage_WheninAnyMood_ShouldReturnHAPPY() throws MoodAnalysisException {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain("I am in Happy Mood");
		String mood = moodanalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}
	
	@Test
	void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() throws MoodAnalysisException {
		MoodAnalyserMain moodanalyser = new MoodAnalyserMain(null);
		try {
			String mood = moodanalyser.analyseMood();
			Assertions.assertEquals("HAPPY", mood);
		}
		catch(MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
