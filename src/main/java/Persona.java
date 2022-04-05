import java.util.Optional;

public class Persona {
    private String name;
    private String city;
    private int edad;


    Persona(String nombre, String poblacion, int edad){
        this.name = nombre;
        this.city = poblacion;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        Optional<String> poblacion=Optional.ofNullable(this.city);
        return poblacion.orElse("Desconocido");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        Optional<Integer> edad=Optional.ofNullable(this.edad);
        return edad.orElse(0);
    }

    public void setAge(Integer age) {
        this.edad = edad;
    }



}
