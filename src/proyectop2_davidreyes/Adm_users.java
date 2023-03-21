package proyectop2_davidreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Adm_users {
   private File f = null;
    ArrayList<Usuario> list = new ArrayList();

    public Adm_users() {
    }
    public Adm_users(String path){
      f = new File (path);}

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public ArrayList<Usuario> getList() {
        return list;
    }

    public void setList(ArrayList<Usuario> list) {
        this.list = list;
    }
    
    public void cargarArchivo() {
        try {
            list = new ArrayList();
            Usuario temp;
            if (f.exists()) {
                FileInputStream entrada
                        = new FileInputStream(f);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        list.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(f);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : list) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
