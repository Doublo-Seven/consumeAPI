package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.kbc.internal.cts.entity.SurveyResult;

public interface SurveyResultDao extends JpaRepository<SurveyResult, Integer> {

}
