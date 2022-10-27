/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futboll;

/**
 *
 * @author 57300
 */
public class Futboll {
    public static void main(String[] args) {
        // TODO code application logic here
        jugador jugadorFutbol = new jugador();
        jugadorFutbol.nombre = "Luis Diaz";
        jugadorFutbol.edad = 23;
        jugadorFutbol.pais = "Colombia";
        jugadorFutbol.posicion = "centrocampista";
        jugadorFutbol.peso = 70;
        jugadorFutbol.gol = 3;
        jugadorFutbol.totalGoles = 30;
        jugadorFutbol.asistencias = 10;
        jugadorFutbol.faltas = 10;
        jugadorFutbol.asistencias();
        jugadorFutbol.correr(20);
        jugadorFutbol.edadJugador();
        jugadorFutbol.golesUltimoPartido();
    }
}
