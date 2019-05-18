package sp.senac.Exercicio.ExercicioTarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="sp.senac.exercicioTarefas.entidades")
public class ExercicioTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioTarefasApplication.class, args);
	}

}
