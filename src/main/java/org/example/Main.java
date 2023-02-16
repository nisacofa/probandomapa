package org.example;

import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //PRIMER EJERCICIO
        Map<String, Integer> seleccionesvecesganadas= new HashMap<>();
        seleccionesvecesganadas.put("España",1);
        seleccionesvecesganadas.put("Argentina",3);
        seleccionesvecesganadas.put("Alemania",4);
        seleccionesvecesganadas.put("Japon",0);
        System.out.println(seleccionesvecesganadas);

        //SEGUNDO EJERCICIO
        Map<String, List<String>> seleccionesjugadores= new HashMap<>();
        List<String> jugadoresEspaña= List.of("Unai Simon", "Ansu Fati");
        List<String> jugadoresArgentina= List.of("Messi", "Di Maria");
        List<String> jugadoresFrancia= List.of("Mbappe", "Dembele");
        seleccionesjugadores.put("España",jugadoresEspaña);
        seleccionesjugadores.put("Argentina",jugadoresArgentina);
        seleccionesjugadores.put("Francia",jugadoresFrancia);
        System.out.println(seleccionesjugadores);

        //TERCER EJERCICIO
        int vecestotales=0;
        for(Integer vecesganadas:seleccionesvecesganadas.values()){
            vecestotales+=vecesganadas;
        }
        System.out.println("Las veces totales son: " + vecestotales + " y con java 8: " + seleccionesvecesganadas.values().stream().mapToInt(num -> num).sum());


        //CUARTO EJERCICIO
        //primera forma
        Map<String, Integer> seleccionesjugadores2= new HashMap<>();
        seleccionesjugadores2.put("España", jugadoresEspaña.size());
        seleccionesjugadores2.put("Argentina", jugadoresArgentina.size());
        seleccionesjugadores2.put("Francia", jugadoresFrancia.size());
        System.out.println(seleccionesjugadores2);

        //segunda forma
        Map<String, Integer> seleccionesjugadores3= new HashMap<>();
        for(String seleccion:seleccionesjugadores.keySet()){
            seleccionesjugadores3.put(seleccion, seleccionesjugadores.get(seleccion).size());

        }
        System.out.println(seleccionesjugadores3);




        //QUINTO EJERCICIO
        Map<String, Map<String, String>> seleccionesposiciones= new HashMap<>();
        List<String> posis= List.of("DELANTERO", "PORTERO", "DEFENSA");
        for(String seleccion:seleccionesjugadores.keySet()) {
            Map<String, String> selec= new HashMap<>();
            seleccionesposiciones.put(seleccion, selec);
            for (String jugadores : seleccionesjugadores.get(seleccion)) {
                Random random = new Random();
                int randomIndex = random.nextInt(posis.size());
                selec.put(jugadores, posis.get(randomIndex));
            }
        }
        System.out.println(seleccionesposiciones);



        //SEXTO EJERCICIO
        for(String seleccion:seleccionesposiciones.keySet()) {
            int del= 0;
            int port= 0;
            int def= 0;
            for(String posiciones:seleccionesposiciones.get(seleccion).values()) {
                if(posiciones.equals("DELANTERO")){
                    del+=1;
                }
                if(posiciones.equals("PORTERO")){
                    port+=1;

                }
                if(posiciones.equals("DEFENSA")){
                    def+=1;

                }
            }
            System.out.println(seleccion + " | DELANTEROS: "+ del+ " | PORTEROS: "+ port+ " | DEFENSAS: "+ def);



        }




    }



}