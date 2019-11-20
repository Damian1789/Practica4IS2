/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joest
 */
public class ContenedorTest1 {

    public ContenedorTest1() {
    }

    @Test
    public void testContenedorintint() {
        /*
        // Voy a testear el funcionamiento de la creación de un contenedor usando el 
        // constructor con parámetros, siendo el primer argumento el ancho y el segundo el alto 
        Contenedor c = new Contenedor(10, 20);
        int ancho = c.getAncho();
        int alto = c.getAlto();
        // Comprobación: 
        assertTrue(ancho == 10);
        assertTrue(alto == 20);
        //Test erroneo:
        assertTrue(ancho == 20); 
        assertTrue(alto == 10);
        */ 

/* 
        //version 2
        // Voy a testear el funcionamiento de la creación de un contenedor usando el 
        // constructor con parámetros, siendo el primer argumento el ancho y el segundo el alto 
        Contenedor c = new Contenedor(10, 20);
        //Comprobacion:
        assertEquals(20, c.getAlto());
        assertEquals(10, c.getAncho());
        //Test erroneo:
        assertEquals(10, c.getAlto());
        assertEquals(20, c.getAncho());
        */ 
/* 
        //version 3
        // Voy a testear el funcionamiento de la creación de un contenedor usando el 
        // constructor con parámetros, siendo el primer argumento el ancho y el segundo el alto 
        Contenedor c = new Contenedor(10, 20);
        //comprobacion
        if(c.getAlto()!=20){
            fail();
        }
        //Comprobacion erronea:
        if(c.getAlto()!=10){
            fail();
        }
        */ 
        
         
    }

    @Test
    public void testCalcularPerimetro() {
        /*
        Contenedor2 c = new Contenedor2(10, 20);
        int perimetro;
        perimetro = c.calcularPerimetro();
        //Comprobacion:
        assertTrue(perimetro == 60);
        //test erroneo
        assertTrue(perimetro == 50);
        */    
        
/*
        //Version 2
        Contenedor2 c = new Contenedor2(10, 20);
        //Comprobacion:
        assertEquals(60, c.calcularPerimetro());
        //test erróneo
        assertEquals(50, c.calcularPerimetro());
*/       
        
/*
        //version3
        Contenedor2 c = new Contenedor2(10, 20);
        //Comprobacion:
        if(c.calcularPerimetro()!=60){
            fail();
        }
        
        //Comprobacion erronea:
        if(c.calcularPerimetro()!=50){
            fail();
        }
*/    

    }
    
    @Test
    public void calculaNumPaquetes() {
/*        
        Contenedor c = new Contenedor(10, 20);
        Paquete p1 = new Paquete(5,10);
        Paquete p2 = new Paquete(10,20);
        Paquete p3 = new Paquete(11,22);
        Paquete p4 = new Paquete(5,20);
        Paquete p5 = new Paquete();
        //Comprobacion:    
        assertTrue(c.calculaNumPaquete(p1) == 4);
        assertTrue(c.calculaNumPaquete(p2) == 1);
        assertTrue(c.calculaNumPaquete(p3) == 0); 
        assertTrue(c.calculaNumPaquete(p4) == 2);
*/
/*
        //comprobacion del error        
        int result = c.calculaNumPaquete(p5); //cabrian infinitos por lo que da error el hecho de intentar calcular el numero
        System.out.println(result);
*/
    }
    
    @Test//JOJO ESTE METODO ES UNA BAZOFIA, MIRALO A VER SI ESQUE SOY TONTO O ALGO, 
            //QUE ES MUY POSIBLE QUE LO SEA PORQUE NO LE VEO LOGICA AL METODO, ES DECIR, 
            //NO HACE LO QUE DEBE PERO PARA NADA
    public void sobrantePaquete(){
        Contenedor c = new Contenedor(10, 20);
        Paquete p1 = new Paquete(5,10);
        Paquete p2 = new Paquete(10,20);
        Paquete p3 = new Paquete(11,22);
        Paquete p4 = new Paquete(5,20);
        Paquete p5 = new Paquete();
        Paquete p6 = new Paquete(7,13);
        Paquete p7 = new Paquete(9,19);
        //Comprobacion:
        System.out.println(c.sobrantePaquete(p1));      //este metodo va muy mal
        System.out.println(c.sobrantePaquete(p2));      //OMG
        System.out.println(c.sobrantePaquete(p6));      // ¿¿¿porque siempre devuelve 200???
        System.out.println(c.sobrantePaquete(p7));      //Este metodo es una broma, ¿¿porque siempre da 200??.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Test
    public void calculaAreaPaquete(){
/*
        Contenedor2 c = new Contenedor2(10, 20);
        Paquete p1 = new Paquete(5, 3);
        //comprobacion
        assertTrue(c.calculaAreaPaquete(p1)==15);
*/
/*
        //comprobacion erronea
        assertTrue(c.calculaAreaPaquete(p1)==20);
*/
    }
    
    @Test
    public void areaTotalPaquetes(){
/*
        Contenedor2 c = new Contenedor2(10, 20);
        Paquete p1 = new Paquete(5, 3); //ocupa 15
        Paquete p2 = new Paquete(2, 5); //ocupa 10
        Paquete p3 = new Paquete(2, 2); //ocupa 4
                                        //total 29
        //comprobacion                  
        c.sumarPaquete(p1);
        c.sumarPaquete(p2);
        c.sumarPaquete(p3);
        assertTrue(c.areaTotalPaquetes()==29);
*/
/*
        //comprobacion erronea
        c.sumarPaquete(p1);
        c.sumarPaquete(p2);
        c.sumarPaquete(p3);
        assertTrue(c.areaTotalPaquetes()==30);
*/
    }

    @Test
    public void espacioSobrante() {
/*
        Contenedor2 c = new Contenedor2(10, 20);    //cabe 200
        Paquete p1 = new Paquete(5, 3); //ocupa 15
        Paquete p2 = new Paquete(2, 5); //ocupa 10
        Paquete p3 = new Paquete(2, 2); //ocupa 4
                                        //total 29 y sobraria 200-29 = 171
        //comprobacion                  
        c.sumarPaquete(p1);
        c.sumarPaquete(p2);
        c.sumarPaquete(p3);
        assertTrue(c.espacioSobrante()==171);
*/
/*        
        //comprobacion erronea
        c.sumarPaquete(p1);
        c.sumarPaquete(p2);
        c.sumarPaquete(p3);
        assertTrue(c.espacioSobrante()==170);
*/
    }

}
