
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 30

Nombre de archivo: main.java 
Descripcion: Clase principal del programa; clase que se compila para iniciar.
*/
public class main {
    public static int cont=0;
    static File archivo = new File("C:\\HDT2\\datos.txt"); //Almacena el archivo en donde se guardaran los datos
    java.io.File directorio = new File("C:\\HDT2");
    public static String data=new String();
    static Stack pila = new StackArrayList();
    static double resultado;
    
public static void main(String[] args) {
    
    data=leerDatos();
    System.out.println(data);
    int largo = data.length();
    for(int i=0;i<largo;i++){
        if((int)data.charAt(i)<10 && (int)data.charAt(i)>=0 ){
            pila.push((int)data.charAt(i));
            System.out.println("dato ingresado");
        }
        if(Character.toString(data.charAt(i)).equals("*")){
            resultado=(int)pila.pop()*(int)pila.pop();
            pila.push(resultado);
        }
        if(Character.toString(data.charAt(i)).equals("+")){
            resultado=(int)pila.pop()+(int)pila.pop();
            pila.push(resultado);
        }
        if(Character.toString(data.charAt(i)).equals("-")){
            resultado=(int)pila.pop()-(int)pila.pop();
            pila.push(resultado);
        }
        if(Character.toString(data.charAt(i)).equals("*/")){
            resultado=(int)pila.pop()/(int)pila.pop();
            pila.push(resultado);
        }
    }
    
}
    public static String leerDatos(){
            FileReader fr = null;
            BufferedReader br = null;
            String datos = new String();
            
            try{
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    if ((linea = br.readLine())!=null){

                        datos=linea;
                        ;
                    }
                    if(datos == null){
                        datos=" ";
                    }
                    
                    return datos;

            }
            catch(Exception e){
                    e.printStackTrace();
            }
            finally{
                    try{
                            if(null != fr ){
                                    fr.close();
                            }
                    }
                    catch(Exception e2){
                            e2.printStackTrace();
                    }

            }
            return datos;
    }

}
