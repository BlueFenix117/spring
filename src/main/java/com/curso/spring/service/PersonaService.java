package com.curso.spring.service;

import com.curso.spring.dto.request.PersonaRequest;
import com.curso.spring.dto.response.DatosPersonaResponse;
import com.curso.spring.model.Personas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

public interface PersonaService {

    List<Personas> findAllPersons();

    ResponseEntity<Personas> guardarPersona(Personas personas);
    ResponseEntity<Personas> guardarPersonaAlternativo(PersonaRequest request);

    Personas buscarPersonaId(Long id);

    ResponseEntity<Object> updatePersona(PersonaRequest request);

    void eliminarPersona(Long id);

    List<String> personasByGenero(String genero);

    ResponseEntity<Object> getInfoPersonas(Integer id);

    ResponseEntity<?> savePersonasNative(PersonaRequest request);

    ResponseEntity<?> updatePersonasNative(PersonaRequest request) throws Exception;

    boolean deletePersonNative(int id)throws Exception;
}
