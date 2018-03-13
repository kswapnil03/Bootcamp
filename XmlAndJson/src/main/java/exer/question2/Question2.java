package exer.question2;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Question2 {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("src/main/java/exer/question2/input.json"));


            JSONObject jsonObject = (JSONObject) obj;




            JSONArray emp = (JSONArray) jsonObject.get("Employees");
            for(Object projectObj: emp.toArray())
            {
                JSONObject project = (JSONObject)projectObj;

                String empid = (String) project.get("emp_id");
                System.out.println(empid);

                String efname = (String) project.get("efname");
                System.out.println(efname);

                String elname = (String) project.get("elname");
                System.out.println(elname);

                String dept = (String) project.get("dept");
                System.out.println(dept);

                String desig = (String) project.get("desig");
                System.out.println(desig);

                String competency = (String) project.get("competency");
                System.out.println(competency);

                long salary = (long) project.get("salary");
                System.out.println(salary);

                String email = (String) project.get("email");
                System.out.println(email);

                long age = (long) project.get("age");
                System.out.println(age);


                long mob = (long) project.get("mob");
                System.out.println(mob);


                System.out.println("....................................");


                try (FileWriter file = new FileWriter("src/main/java/exer/question2/output.json")) {

                    file.write(jsonObject.toJSONString());
                    file.flush();
                    //file.write(" \n ");

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
