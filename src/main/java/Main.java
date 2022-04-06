


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
public class Main {

    public static void main(String[] args){
        BufferedReader br;
        String line;
        int edad;
        String name;
        String city;
        List<Persona> personas = new ArrayList<>();
        try{
            br=new BufferedReader(new FileReader("src/main/java/fichero.txt"));
            while((line = br.readLine())!=null){
                String[] linea= line.split(":");
                name = linea[0];
                city = linea[1];
                if (linea.length >2){
                    edad = parseInt(linea[2]);
                    Persona p = new Persona(name, city, edad);
                    personas.add(p);
                    System.out.println("Nombre: "+p.getName()+". Poblacion: "+p.getCity()+". Edad: "+p.getAge());
                }else{
                    edad=-1;
                    Persona p = new Persona(name, city, edad);
                    personas.add(p);
                    System.out.println("Nombre: "+p.getName()+". Poblacion: "+p.getCity()+". Edad: Desconocido");
                }
            }
            System.out.println("\nMenores de 25 años:");
            personas.stream().filter(e -> e.getAge() <25 && e.getAge()>0).forEach(e-> System.out.println("Nombre: "+e.getName()));

        } catch (FileNotFoundException e){
            System.out.println("Error: Fichero no disponible");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
