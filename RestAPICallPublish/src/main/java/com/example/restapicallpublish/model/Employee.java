package com.example.restapicallpublish.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
     Long id;
     String name;
     String location;
}
