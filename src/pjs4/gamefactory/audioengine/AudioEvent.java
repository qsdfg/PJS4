/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjs4.gamefactory.audioengine;

import java.io.File;

/**
 *
 * @author scalpa
 */
public class AudioEvent {
    
    private AudioResource resource;
    private float volume;
    private float delay;
    
    public File getAudioFile() {
        return resource.getAudioFile();
    }
    
}
