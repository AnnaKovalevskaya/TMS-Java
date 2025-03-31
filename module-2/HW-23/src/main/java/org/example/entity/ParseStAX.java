package org.example.entity;

import javax.xml.stream.*;
import java.io.*;

public class ParseStAX {
    public static void main(String[] args) {
        String xmlFilePath = "module-2/HW-23/src/main/resources/students.xml";

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(xmlFilePath));

            while (reader.hasNext()) {
                int event = reader.next();

                if (event == XMLStreamConstants.START_ELEMENT) {
                    String elementName = reader.getLocalName();

                    if ("student".equals(elementName)) {
                        String id = reader.getAttributeValue(null, "id");
                        String name = "";
                        String age = "";
                        String subject = "";

                        while (reader.hasNext()) {
                            event = reader.next();

                            if (event == XMLStreamConstants.START_ELEMENT) {
                                String innerElementName = reader.getLocalName();

                                if ("name".equals(innerElementName)) {
                                    name = reader.getElementText();
                                } else if ("age".equals(innerElementName)) {
                                    age = reader.getElementText();
                                } else if ("subject".equals(innerElementName)) {
                                    subject = reader.getElementText();
                                }
                            }

                            if (event == XMLStreamConstants.END_ELEMENT && "student".equals(reader.getLocalName())) {
                                break;
                            }
                        }

                        System.out.println("Student ID: " + id);
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Subject: " + subject);
                        System.out.println();
                    }
                }
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}