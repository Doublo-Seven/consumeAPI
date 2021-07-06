package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.kbc.internal.cts.entity.Survey;

public interface SurveyDao extends JpaRepository<Survey, Integer> {

}
