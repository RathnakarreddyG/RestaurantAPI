package com.rms.grr.repository;

import com.rms.grr.models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchDao extends JpaRepository<Branch, Long> {
}
