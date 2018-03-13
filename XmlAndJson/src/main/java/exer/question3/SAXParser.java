package exer.question3;


import java.io.File;

import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParser {
    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/java/exer/question3/input.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();

            javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();

            UserHandler userhandler = new UserHandler();

            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UserHandler extends DefaultHandler
{

    boolean empid = false;
    boolean fname = false;
    boolean lname = false;
    boolean dept = false;
    boolean desig = false;
    boolean com = false;
    boolean email= false;
    boolean salary = false;
    boolean age = false;
    boolean mob = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        if (qName.equalsIgnoreCase("employee"))
        {
            String empid = attributes.getValue("empid");

            System.out.println("Employee ID : " + empid);

        }

        else if (qName.equalsIgnoreCase("efname"))
        {
            fname = true;
        }

        else if (qName.equalsIgnoreCase("elname"))
        {
            lname = true;
        }

        else if (qName.equalsIgnoreCase("dept"))
        {
            dept = true;
        }

        else if (qName.equalsIgnoreCase("desig"))
        {
            desig = true;
        }

        else if (qName.equalsIgnoreCase("competency"))
        {
            com = true;
        }

        else if (qName.equalsIgnoreCase("salary"))
        {
            salary = true;
        }

        else if (qName.equalsIgnoreCase("email"))
        {
            email = true;
        }

        else if (qName.equalsIgnoreCase("age"))
        {
            age = true;
        }

        else if (qName.equalsIgnoreCase("mob"))
        {
            mob = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("employee")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if (fname)
        {
            System.out.println("First Name: " + new String(ch, start, length));
            fname = false;
        }

        else if (lname)
        {
            System.out.println("Last Name: " + new String(ch, start, length));
            lname = false;
        }

        else if (dept)
        {
            System.out.println("Department: " + new String(ch, start, length));
            dept = false;
        }

        else if (desig)
        {
            System.out.println("Designation: " + new String(ch, start, length));
            desig = false;
        }

        else if (com)
        {
            System.out.println("Competency: " + new String(ch, start, length));
            com = false;
        }

        else if (salary)
        {
            System.out.println("Salary: " + new String(ch, start, length));
            salary = false;
        }

        else if (email)
        {
            System.out.println("email: " + new String(ch, start, length));
            email = false;
        }

        else if (age)
        {
            System.out.println("Age: " + new String(ch, start, length));
            age = false;
        }

        else if (mob)
        {
            System.out.println("Mobile : " + new String(ch, start, length));
            mob = false;
        }
    }
}
