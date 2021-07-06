package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.kbc.internal.cts.entity.QuestionSet;

public interface QuestionSetDao extends JpaRepository<QuestionSet, Integer> {

}
