package com.curso.spring.service.impl;

import com.curso.spring.dto.response.Posts;
import com.curso.spring.service.EjerciciosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service

public class EjerciciosServiceImpl implements EjerciciosService {

    @Override
    public List<String> getNombres() {
        log.info("Entro al metodo get nombres");

        List<String> listaNombres = new ArrayList<>();
        List<String> response = new ArrayList<>();

        listaNombres.add("Heriberto");
        listaNombres.add("Edgar");
        listaNombres.add("Octavio");
        listaNombres.add("Silvia");

        /*for (String nombre : listaNombres) {
            if (nombre.toLowerCase().contains("o")) {
                log.info("Entro al if de la lista nombres");
                response.add(nombre);
            }
        }*/

        /*int index = 0;
        while (index < listaNombres.size){
            String nombre = listaNombres.get(index);
                if (nombre.toLowerCase().contains("o")){
                    log.info("Entro al if de la lista nombres");
                    response.add(nombre);
                }
                index++;
        }*/

        /*int index =0;
        do{
            String nombre = listaNombres.get(index);
            if (nombre.toLowerCase().contains("o")){
                log.info("Entro al if de la lista nombres");
                response.add(nombre);
            }
            index++;
        }while (index < listaNombres.size);*/

        response = listaNombres.stream()
                .filter(nombre -> nombre.toLowerCase().contains("i"))
                .collect(Collectors.toList());
        return response;
    }

    //App.ymlspring:
    //  url:
    //    posts: https://jsonplaceholder.typicode.com/todos/1
    @Override
    public Posts getPost(int id) {

        ResponseEntity<Posts> resultPosts = null;
        try{
            String url = "https://jsonplaceholder.typicode.com/todos/" + id;

            RestTemplate restTemplate = new RestTemplate();

            //Forma1

            //resultPosts = restTemplate.exchange(url, HttpMethod.GET, null, Posts.class);

            //Forma 2
            Posts response =restTemplate.getForObject(url, Posts.class);

            resultPosts = ResponseEntity.ok(response);

        }catch (Exception e){
            log.error("Error al consumir el servicio");
        }
        return resultPosts.getBody();
    }
}