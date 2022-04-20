package moodanalyser;

public class MoodAnalysisException extends Exception {

	enum MoodType {EMPTY, NULL}
	
	MoodType type;
	
	public MoodAnalysisException(MoodType type,String message) {
		super(message);
		this.type = type;
	}
}
