package ma.enset.gestion_patient;

import ma.enset.gestion_patient.entities.Patient;
import ma.enset.gestion_patient.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
@SpringBootApplication
public class GestionPatientApplication implements CommandLineRunner{

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionPatientApplication .class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "khallouq", "kawtar", new Date(), true, 10));
        patientRepository.save(new Patient(null, "kawtar", "khallouq",new Date(), false, 20));


    }
}