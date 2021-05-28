/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obtenerRecursos;
import java.applet.AudioClip;
/**
 * @author Noureddine El Qaddoury.
 */


public class Audio {

    public AudioClip getAudio(String direccion) {
        return java.applet.Applet.newAudioClip(getClass().getResource(direccion));
    }
   
}
