package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.kbc.internal.cts.entity.Role;

public interface RoleDao extends JpaRepository<Role, Integer> {

}
