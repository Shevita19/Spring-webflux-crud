package com.webflux.Springwebfluxcrud.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection= "Customer")
public class Customer {        //we don't have entity annotation in reactive as we don't use jdbc but its reactive relational db connectivity
   @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;

}
