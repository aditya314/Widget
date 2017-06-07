package com.teknikindustries.widget;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author ANKS
 */
public class LaunchBrowser {
    
    public void LaunchFacebook(){
        try{
           Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        }
        catch(IOException e){
            
        }
    }
    public void LaunchTwitter(){
        try{
           Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        }
        catch(IOException e){
            
        }
    }
    public void LaunchAmazon(){
        try{
           Desktop.getDesktop().browse(URI.create("www.amazon.com"));
        }
        catch(IOException e){
            
        }
    }
    public void LaunchYouTube(){
        try{
           Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        }
        catch(IOException e){
            
        }
    }
}
