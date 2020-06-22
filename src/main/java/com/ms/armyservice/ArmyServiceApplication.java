package com.ms.armyservice;

import com.ms.armyservice.entities.Army;
import com.ms.armyservice.repositiories.ArmyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArmyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArmyServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner seedDatabase(ArmyRepository repository) {
        return args -> {
            repository.save(Army.builder()
                    .personId(1L)
                    .dragons(0)
                    .knights(10)
                    .soldiers(20000)
                    .ships(50)
                    .build());

			repository.save(Army.builder()
					.personId(2L)
					.dragons(0)
					.knights(1)
					.soldiers(2000)
					.ships(10)
					.build());

			repository.save(Army.builder()
					.personId(3L)
					.dragons(2)
					.knights(5)
					.soldiers(50000)
					.ships(200)
					.build());

			repository.save(Army.builder()
					.personId(4L)
					.dragons(1)
					.knights(15)
					.soldiers(100000)
					.ships(20)
					.build());

			repository.save(Army.builder()
					.personId(5L)
					.dragons(0)
					.knights(20)
					.soldiers(30000)
					.ships(500)
					.build());
        };
    }


}
