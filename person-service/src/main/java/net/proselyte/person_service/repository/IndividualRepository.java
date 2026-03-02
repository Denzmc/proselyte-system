package net.proselyte.person_service.repository;


import net.proselyte.person_service.entity.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface IndividualRepository extends JpaRepository<Individual, UUID> {

    @Query("""
        from Individual i where (:emails) is null or i.user.email in :emails
        """)
    List<Individual> findAllByEmails(@Param("emails") List<String> emails);

    @Modifying
    @Query("""
        update Individual i set i.active = false  where i.id = :id
        """)
    void softDelete(@Param("id") UUID id);
}
