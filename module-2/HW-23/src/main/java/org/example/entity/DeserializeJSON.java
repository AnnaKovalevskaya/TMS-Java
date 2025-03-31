package org.example.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeJSON {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Kate\",\"age\":22,\"subject\":\"Math\"}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Student student = objectMapper.readValue(jsonString, Student.class);

            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Subject: " + student.getSubject());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
