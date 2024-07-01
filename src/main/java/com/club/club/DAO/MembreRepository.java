package com.club.club.DAO;

import com.club.club.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {


        Membre findByCinAndPassword(String cin, String password);

}
