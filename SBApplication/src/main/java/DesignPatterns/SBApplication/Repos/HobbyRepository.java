package DesignPatterns.SBApplication.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DesignPatterns.SBApplication.Beans.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {

}
