package org.example.entity;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class ParseXML {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("module-2/HW-23/src/main/resources/sonnet.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            String firstName = doc.getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = doc.getElementsByTagName("lastName").item(0).getTextContent();
            String title = doc.getElementsByTagName("title").item(0).getTextContent();

            String fileName = firstName + "_" + lastName + "_" + title + ".txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            NodeList lineList = doc.getElementsByTagName("line");
            for (int i = 0; i < lineList.getLength(); i++) {
                String line = lineList.item(i).getTextContent();
                writer.write(line);
                writer.newLine();
            }

            writer.close();
            System.out.println("Содержимое записано в файл: " + fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}