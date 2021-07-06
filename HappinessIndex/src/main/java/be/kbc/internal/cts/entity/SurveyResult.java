package be.kbc.internal.cts.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SurveyResult {

	@Id
	private int surveyResultId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "surveyId")
	private Survey survey;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId")
	private QuestionSet qSet;
	
	private int avgResult;

	public SurveyResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurveyResult(int surveyResultId, Survey survey, QuestionSet qSet, int avgResult) {
		super();
		this.surveyResultId = surveyResultId;
		this.survey = survey;
		this.qSet = qSet;
		this.avgResult = avgResult;
	}

	public int getSurveyResultId() {
		return surveyResultId;
	}

	public void setSurveyResultId(int surveyResultId) {
		this.surveyResultId = surveyResultId;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public QuestionSet getqSet() {
		return qSet;
	}

	public void setqSet(QuestionSet qSet) {
		this.qSet = qSet;
	}

	public int getAvgResult() {
		return avgResult;
	}

	public void setAvgResult(int avgResult) {
		this.avgResult = avgResult;
	}

}
