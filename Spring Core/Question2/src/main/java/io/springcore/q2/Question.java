package io.springcore.q2;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Question {
     public int questionId;
     public String question;
     public String answer;
	public int setQuestionId(int questionId) {
    	 this.questionId= questionId;
    	 return 0;    	 
     }
     public int getQuestionId() {
    	 System.out.println("The question id is: "+questionId);
    	 return 0;     
    	 }
	public String getQuestion() {
		System.out.println("The question is: "+question);
		return null;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		System.out.println("The answer is: "+answer);
		return null;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
