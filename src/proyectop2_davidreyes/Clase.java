package proyectop2_davidreyes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Clase implements Serializable {

    private String id, nameclass, hora;

    private int unidadesv, periodo, semestre, year;
    Maestro maestro;
    private ArrayList<Alumno> alums;
    ArrayList<Examen> ex;
    ArrayList<Tarea> tarea;

    public Clase(String id, String nameclass, String hora, int unidadesv, int periodo, int semestre, int year, Maestro maestro, ArrayList<Alumno> alums, ArrayList<Examen> ex, ArrayList<Tarea> tarea) {
        this.id = id;
        this.nameclass = nameclass;
        this.hora = hora;
        this.unidadesv = unidadesv;
        this.periodo = periodo;
        this.semestre = semestre;
        this.year = year;
        this.maestro = maestro;
        this.alums = alums;
        this.ex = ex;
        this.tarea = tarea;
    }

    public ArrayList<Examen> getEx() {
        return ex;
    }

    public void setEx(ArrayList<Examen> ex) {
        this.ex = ex;
    }

    public ArrayList<Tarea> getTarea() {
        return tarea;
    }

    public void setTarea(ArrayList<Tarea> tarea) {
        this.tarea = tarea;
    }

    public ArrayList<Alumno> getAlums() {
        return alums;
    }

    public void setAlums(ArrayList<Alumno> alums) {
        this.alums = alums;
    }

    public Clase() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameclass() {
        return nameclass;
    }

    public void setNameclass(String nameclass) {
        this.nameclass = nameclass;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUnidadesv() {
        return unidadesv;
    }

    public void setUnidadesv(int unidadesv) {
        this.unidadesv = unidadesv;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", nameclass=" + nameclass + ", hora=" + hora + ", unidadesv=" + unidadesv + ", periodo=" + periodo + ", semestre=" + semestre + ", year=" + year + ", maestro=" + maestro + ", ex=" + ex + ", tarea=" + tarea + '}';
    }

    

    public String toStringal() {
        return "Codigo clase: " + id + ", Nombre de la clase: " + nameclass + ", Hora: " + hora + ", Unidades valorativas: " + unidadesv + ", Periodo: " + periodo + ", Semestre: " + semestre + ", Año: " + year + "Alumnos " + alums;
    }
}
