package ma.enset.gestion_patient.repositories;

import ma.enset.gestion_patient.entities.Patient;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNomContains(String nom, Pageable pageable);
    Patient findByNom(String nom);
    @Query("select p from Patient p where p.id = :id")
    Patient search(@Param("id")long id);
}