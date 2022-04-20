package moodanalyser;

public class MoodAnalyserMain {
	
	String analyseMood(String msg) {
		if(msg.contains("Sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
