package com.practice.splitwise.repo;

import com.practice.splitwise.model.SplitGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SplitGroupRepository extends JpaRepository<SplitGroup, Integer> {

}
