package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.kbc.internal.cts.entity.Team;

public interface TeamDao extends JpaRepository<Team, Integer> {

}
