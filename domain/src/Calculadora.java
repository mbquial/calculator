/*
* Calculadora

* Versión: 1.1
* Inicio: 21 de Diciembre del 2025
* Fin:

* Este programa realiza operaciones matemáticas básicas: suma, resta, multiplicación y división.
* Funciones actuales: Operaciones básicas + porcentaje (está muuuy crudo)
* Hecho por: Karla
*/

public class Calculadora {

    /*
    * Do adds
    * @param a: a number to work with
    * @param b: another number to work with
    * 
    * @return: number equal to 'a' add 'b'
    */
    public float add(float a, float b){
        return a+b;
    }
    
    /*
    * Do subtraction
    * @param a: a number to work with
    * @param b: another number to work with
    * 
    * @return: number equal to 'a' subtract 'b'
    */
    public float minus(float a, float b){
        return a-b;
    }

    /*
    * Do multiplications
    * @param a: a number to work with
    * @param b: another number to work with
    * 
    * @return: number equal to 'a' times 'b'
    */
    public float times(float a, float b){
        return a*b;
    }

    /*
    * Do divisions
    * @param a: a number to work with
    * @param b: another number to work with
    * 
    * @return: the cocient between 'a' and 'b'
    */
    public float div(float a, float b){
        return a/b;
    }
    
    /*
    * Manage percentages
    * @param a: number for convertion
    * 
    * @return: number digited for 'a' divide by 100
    */
    public float percentage(float a){
        return a / 100;
    }
}
