package com.phoenixcoder.api.repositories;

import com.phoenixcoder.api.models.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface ChildRepository extends JpaRepository<Child,Integer> {

}
