package moodanalyser;

public class MoodAnalyserMain {
	
	String msg;
	
	public MoodAnalyserMain() {
		
	}
	
	public MoodAnalyserMain(String msg) {
		this.msg = msg;
	}
	
	String analyseMood() {
		if(msg.contains("Sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
