package com.example.demo.repository;

import com.example.demo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRespository extends JpaRepository<Role, Integer> {
    @Query(value = "select * from Role where name=?", nativeQuery = true)
    Role findRoleByName(String name);

    @Query(value = "select * from Role where id=?", nativeQuery = true)
    Role findRoleById(Integer id);
}
