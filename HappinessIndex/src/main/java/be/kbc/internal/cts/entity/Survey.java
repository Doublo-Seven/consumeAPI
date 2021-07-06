package be.kbc.internal.cts.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Survey {

	@Id
	private int surveyId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	
	private int userRating;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId")
	private QuestionSet qSet;
	
	public Survey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Survey(int surveyId, User user, int userRating, QuestionSet qSet) {
		super();
		this.surveyId = surveyId;
		this.user = user;
		this.userRating = userRating;
		this.qSet = qSet;
	}
	
	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public QuestionSet getqSet() {
		return qSet;
	}

	public void setqSet(QuestionSet qSet) {
		this.qSet = qSet;
	}


}
