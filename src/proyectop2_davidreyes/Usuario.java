package proyectop2_davidreyes;

import java.io.Serializable;

public class Usuario implements Serializable{

    private String user, pass, Categ;

    public Usuario() {
    }

    public Usuario(String user, String pass, String Categ) {
        this.user = user;
        this.pass = pass;
        this.Categ = Categ;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCateg() {
        return Categ;
    }

    public void setCateg(String Categ) {
        this.Categ = Categ;
    }
    
    
    @Override
    public String toString() {
        return "Usuario: " + user + " Password: " + pass + '}';
    }

}
