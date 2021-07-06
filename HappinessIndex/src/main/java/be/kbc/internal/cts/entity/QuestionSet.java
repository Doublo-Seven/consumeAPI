package be.kbc.internal.cts.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class QuestionSet {

	@Id
	private int questionId;
	private LocalDate surveyMonth;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamId")
	private Team team;
	
	private String question;
	private int retentionInMonths;
	
	public QuestionSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionSet(int questionId, LocalDate surveyMonth, Team team, String question, int retentionInMonths) {
		super();
		this.questionId = questionId;
		this.surveyMonth = surveyMonth;
		this.team = team;
		this.question = question;
		this.retentionInMonths = retentionInMonths;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public LocalDate getSurveyMonth() {
		return surveyMonth;
	}

	public void setSurveyMonth(LocalDate surveyMonth) {
		this.surveyMonth = surveyMonth;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getRetentionInMonths() {
		return retentionInMonths;
	}

	public void setRetentionInMonths(int retentionInMonths) {
		this.retentionInMonths = retentionInMonths;
	}

}
