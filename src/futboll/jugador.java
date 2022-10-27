/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futboll;

/**
 *
 *
 */
public class jugador {
    String nombre;
    int edad;
    String pais;
    String posicion;
    int peso;
    int gol;
    int totalGoles;
    int asistencias;
    int faltas;

    public void correr(int c) {
        System.out.println("el jugador va a ir corriendo " + c + " km/h");
    }

    public void nombreJugador() {
        System.out.println("El nombre del jugador es: " + this.nombre);
    }

    public void edadJugador() {
        System.out.println("Edad del Jugador: " + this.edad);
    }

    public void paisNatal() {
        System.out.println("Pais Natal: " + this.pais);
    }

    public void posicionJugador() {
        System.out.println("Posicion: " + this.posicion);
    }

    public void pesoJugador() {
        System.out.println("Peso Actual: " + this.peso + "kg");
    }

    public void golesUltimoPartido() {
        System.out.println("Goles de ultimo Partido:  " + this.gol);
    }

    public void totalGoles() {
        System.out.println("Total Goles:  " + this.totalGoles);
    }

    public void asistencias() {
        System.out.println("Total asistencias:  " + this.asistencias);
    }

    public void totalFaltas() {
        System.out.println("Faltas:  " + this.faltas);
    }
}