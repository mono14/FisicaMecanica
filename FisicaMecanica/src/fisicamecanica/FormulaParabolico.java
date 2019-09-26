package fisicamecanica;

public class FormulaParabolico {

    String vi = "";//Velocidad inicial
    float g = 0;//gravedad
    String an = "";//angulo
    float result;// esta variable  se utiliza para retornar los resultados de los metodos

    //math.sqrt esta funcion sirve para  tener la raiz de un numero
    //Math.pow esta funcion sirve para elevar un numero 
    //math.Radians sirve para obtener los en angulo en radianes
    //Float.parseFloat esta funcion sirve para convertir un numero capturado de un texto  
    //math.sin  esta funcion es para utilizar seno
    //math.cos  esta funcion es para utilizar coseno
    
    public Float Tiempodevuelototal() {
        float v = Float.parseFloat(vi);
        double radi = Math.toRadians(Float.parseFloat(an));
        result = (float) (((float) 2 * v * Math.sin(radi)) / g);
        return result;
    }

    public Float alturaMaxima() {
        float v = Float.parseFloat(vi);
        double angulo = Math.toRadians(Float.parseFloat(an));
        float cuadrado = (float) Math.pow((float) Math.sin(angulo), 2);
        result = (float) (Math.pow(v, 2) * cuadrado) / (2 * g);
        return result;
    }

    public Float tiempoenalcanzaralturamaxima() {
        float v = Float.parseFloat(vi);
        double radi = Math.toRadians(Float.parseFloat(an));
        result = (float) (((float) v * Math.sin(radi)) / g);
        return result;
    }

    public Float AlcanceHotizontal() {
        float v = Float.parseFloat(vi);
        double radi = Math.toRadians(Float.parseFloat(an));
        result = (float) ((2 * Math.pow((float) v, 2) * Math.sin(radi) * Math.cos(radi)) / g);
        return result;

    }

}
