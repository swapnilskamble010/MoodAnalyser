package moodanalyser;

public class MoodAnalyserMain {
	
	String msg;
	
	public MoodAnalyserMain() {
		
	}
	
	public MoodAnalyserMain(String msg) {
		this.msg = msg;
	}
	
	String analyseMood() throws MoodAnalysisException {
		try {
			if(msg.contains("Sad")) {
				return "SAD";
			}
			return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("The message is Empty");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
