package proyectop2_davidreyes;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno extends Usuario implements Serializable {

    private String cuenta, nombre, carrera;
    private int clasescursadas;
    private ArrayList<Clase> clases;

    public Alumno(String cuenta, String nombre, String carrera, int clasescursadas, ArrayList<Clase> clases, String user, String pass, String Categ) {
        super(user, pass, Categ);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.clasescursadas = clasescursadas;
        this.clases = clases;
    }

    public Alumno() {
        super();
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getClasescursadas() {
        return clasescursadas;
    }

    public void setClasescursadas(int clasescursadas) {
        this.clasescursadas = clasescursadas;
    }

    @Override
    public String toString() {
        return "Es alumno " + "Cuenta: " + cuenta + ", Nombre:" + nombre + ", Carrera: " + carrera + ", Clases cursadas: " + clasescursadas+"Clases "+clases;
    }

}
