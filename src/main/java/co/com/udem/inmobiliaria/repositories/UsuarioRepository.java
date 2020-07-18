package co.com.udem.inmobiliaria.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.com.udem.inmobiliaria.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	Optional<Usuario> findByNumeroIdentif(int numeroIdentif);

}
