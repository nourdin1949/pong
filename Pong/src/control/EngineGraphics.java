/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.EventoTeclado;
import clases.Tablero;
import clases.Pelota;

/**
 * @author Noureddine El Qaddoury.
 */
public class EngineGraphics extends Thread {

    private final Tablero canvas;
    public static int nn=0;
    public EngineGraphics(Tablero canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        while (!Pelota.finJuego) {
            canvas.repaint();
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}
