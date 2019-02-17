/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajodos;

/**
 *
 * @author moyha
 */
public class Calculadora implements iCalculadora {
    
    private static Calculadora cal;
    
    public static Calculadora crearCalculadora()
    //Pre: there shall not be a current instance of a calculator
    //Post: Returns a instance only if there is no other
    {
        if (cal==null){
            cal =new Calculadora();
        }
        return cal;
    }
    
    public int sumar(int a, int b){
        return a+b;
    }
    
    public int restar(int a, int b){
        return a-b;
    }
    
    public int multiplicar(int a, int b){
        return a*b;
    }
    
    public int dividir(int a, int b){
        return a/b;
    }
    
}
