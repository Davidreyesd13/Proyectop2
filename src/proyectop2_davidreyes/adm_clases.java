package proyectop2_davidreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adm_clases {

    private File f = null;
    ArrayList<Clase> list = new ArrayList();

    public adm_clases(String path) {
        f = new File(path);
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public ArrayList<Clase> getList() {
        return list;
    }

    public void setList(ArrayList<Clase> list) {
        this.list = list;
    }
    
    public void setClase(Clase c){
        list.add(c);
    }
    public void cargarArchivo() {
        try {
            list = new ArrayList();
            Clase temp;
            if (f.exists()) {
                FileInputStream entrada
                        = new FileInputStream(f);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clase) objeto.readObject()) != null) {
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
            for (Clase t : list) {
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
