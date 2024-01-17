package com.SBApplication.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBApplication.Beans.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {

}
