package exer.question3;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomParser {

    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/java/exer/question3/input.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());


            NodeList nList = doc.getElementsByTagName("employee");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Employee emp_id : " + eElement.getAttribute("empid"));

                    System.out.println(
                            "First Name : " + eElement.getElementsByTagName("efname").item(0).getTextContent());

                    System.out.println(
                            "Last Name : " + eElement.getElementsByTagName("elname").item(0).getTextContent());

                    System.out.println(
                            "Department : " + eElement.getElementsByTagName("dept").item(0).getTextContent());

                    System.out.println(
                            "Designation : " + eElement.getElementsByTagName("desig").item(0).getTextContent());

                    System.out.println(
                            "Competency : " + eElement.getElementsByTagName("competency").item(0).getTextContent());

                    System.out.println("salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

                    System.out.println(
                            "Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());

                    System.out.println(
                            "Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());

                    System.out.println(
                            "Mobile No. : " + eElement.getElementsByTagName("mob").item(0).getTextContent());



                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
