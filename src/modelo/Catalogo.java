/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author Jhon Nash
 */
public class Catalogo {
    private Pelicula pelicula;

 

    public Catalogo() {
        pelicula = new Pelicula();
    }
    
    /*metodo que genera el codigo de barras*/
    public String generaCodigodeBarras(){
        String codigo = null;
        Random rnd = new Random();
        int rndX=0;
        int rndY=0;
        int rndW=0;
        
        rndX=rnd.nextInt(9999);
        rndY=rnd.nextInt(9999);
        rndW=rnd.nextInt(9999);
        codigo = rndX+"-"+rndY+"-"+rndW+"";
        
            
        return codigo;
    } 
    /*Metodo que registra una pelicula*/
    public boolean adicionarPelicula(String codigo,String nombre, String actorPrincipal
        ,String genero, String precio ){
        boolean bandera=false;
        pelicula.setNombre(nombre);
        pelicula.setActorPrincipal(actorPrincipal);
        pelicula.setGenero(genero);
        pelicula.setPrecio(Double.parseDouble(precio));// recino una cadena de caracteres, por tanto lo debo guardar como un double en el objeto
        pelicula.setCodigo(this.generaCodigodeBarras());

        
        
        return bandera;
    }
    
    public Pelicula desplegarInfoPelicula(Pelicula pelicula){
        /*No se si se va a utilizar */
        return pelicula;
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }
}
