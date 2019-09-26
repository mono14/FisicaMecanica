/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisicamecanica;

/**
 *
 * @author daniel , maicol
 */
public class FormulaSemiParabolico {

    String vi = "";//velocidad inicial
    String vy = "";//velocidad inicial en y
    String VyF = "";//velocidad final en la posicion y
    String Yi;//posicion inicial    
    String Yf;//posicion final
    float g = 0;//gravedad
    float result;// esta variable  se utiliza para retornar los resultados de los metodos
   
     //math.sqrt esta funcion sirve para  tener la raiz de un numero
    //Math.pow esta funcion sirve para elevar un numero 
    public Float VelocidadfinalY() {//en este metodo se llama el metodo  tiempo para poder hallar velocidad final
        result = ( g * Tiempo());
        return result;
    }

    public Float VelocidadFinal() {
        float Vi = Float.parseFloat(vi);
        result = (float) Math.sqrt(Math.pow(VelocidadfinalY(), 2) + Math.pow(Vi, 2));
        return result;
    }
    

    public Float Tiempo() {
        float yi=Float.parseFloat(Yi);
        result=(float)Math.sqrt((2*yi)/g);
        return result;
    }
    public Float Xmax(){
        float Vi = Float.parseFloat(vi);
        result=Vi*Tiempo();
        return result;
    }
}
