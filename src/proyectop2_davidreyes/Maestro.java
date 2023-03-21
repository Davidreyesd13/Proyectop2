package proyectop2_davidreyes;

import java.io.Serializable;
import java.util.ArrayList;

public class Maestro extends Usuario implements Serializable{

    private String id, name, profesion;
    private int sueldo;
    private ArrayList<Clase> cursos;

    public Maestro() {
    }

    public Maestro(String id, String name, String profesion, int sueldo, ArrayList<Clase> cursos, String user, String pass,String categ) {
        super(user, pass,categ);
        this.id = id;
        this.name = name;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.cursos = cursos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Clase> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Clase> cursos) {
        this.cursos = cursos;
    }

        public void actualizarCurso(String id,Clase clase){
            for (int i = 0; i < cursos.size(); i++) {
              if(cursos.get(i).getId().equals(id)){
                  cursos.remove(i);
                  cursos.add(clase);
                  break;
              }  
            }
 
        }
    @Override
    public String toString() {
        return "Es Maestro" + " Su id: " + id + ", Nombre: " + name + ", Profesion:" + profesion + " Sueldo: " + sueldo + ", Cursos o Curso: " + cursos;
    }

}
