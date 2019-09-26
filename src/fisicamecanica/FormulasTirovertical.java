/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisicamecanica;

/**
 *
 * @author daniel y maicol
 */
public class FormulasTirovertical {

    String yi = "";//posicion inicial
    String angulo = "";
    String vi = "";//velocidad inicial
    float g = 0;//gravedad
    float result = 0;// esta variable  se utiliza para retornar los resultados de los metodos

    //math.sqrt esta funcion sirve para  tener la raiz de un numero
    //Math.pow esta funcion sirve para elevar un numero 
    //math.Radians sirve para obtener los en angulo en radianes
    //Float.parseFloat esta funcion sirve para convertir un numero capturado de un texto  
    //math.sin  esta funcion es para utilizar seno
    public Float Tiempo() {
        float velocidadinicial = Float.parseFloat(vi);
        float Alturaincial = Float.parseFloat(yi);
        double Angulo = Math.toRadians(Float.parseFloat(angulo));
        float raiz = (float) Math.sqrt(Math.pow(velocidadinicial * Math.sin(Angulo), 2) - 4 * (-g / 2) * (Alturaincial));
        float suma = (-(velocidadinicial * (float) Math.sin(Angulo)) + raiz) / (2 * (-g / 2));
        float resta = (-(velocidadinicial * (float) Math.sin(Angulo)) - raiz) / (2 * (-g / 2));
        if (suma > 0) {
            result = suma;
        } else {
            result = resta;
        }
        return result;
    }

    public Float alturaMaxima() {
        float v = Float.parseFloat(vi);
        float Alturaincial = Float.parseFloat(yi);
        double Angulo = Math.toRadians(Float.parseFloat(angulo));
        float cuadrado = (float) Math.pow((float) Math.sin(Angulo), 2);
        float altura = (float) (Math.pow(v, 2) * cuadrado) / g;
        result = Alturaincial + altura;
        return result;
    }

    public Float DistanciaTotal() {
        float velocidadinicial = Float.parseFloat(vi);
        double Angulo = Math.toRadians(Float.parseFloat(angulo));
        result = (velocidadinicial * (float) Math.cos(Angulo) * Tiempo());
        return result;
    }

    public Float VelocidadenX() {
        float velocidadinicial = Float.parseFloat(vi);
        double Angulo = Math.toRadians(Float.parseFloat(angulo));
        result = velocidadinicial * (float) Math.cos(Angulo);
        return result;
    }

    public Float VelocidadenY() {
        float velocidadinicial = Float.parseFloat(vi);
        double Angulo = Math.toRadians(Float.parseFloat(angulo));
        result = (velocidadinicial * (float) Math.sin(Angulo));
        return result;
    }

    public Float Velocidadfinal() {
        result = (float) Math.sqrt(Math.pow(VelocidadenX(), 2) + Math.pow(VelocidadenY(), 2));
        return result;
    }
    public Float tiempoamitad(){
        result=VelocidadenY()/g;
        return result;
    }
}
