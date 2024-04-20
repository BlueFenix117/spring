package com.curso.spring.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Posts {

    //@JsonProperty(value = "user_id")
    int userId;
    int id;
    String title;
    Boolean completed;
}
