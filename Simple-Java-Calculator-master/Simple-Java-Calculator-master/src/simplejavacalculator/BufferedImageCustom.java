package simplejavacalculator;

import simplejavacalculator.Proxy.Imageservice;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

/**
 *This class will return an image
 *from a binary data.
 */
public class BufferedImageCustom implements Imageservice {
   public Image imageReturn() 
      throws IOException {
      Image image;
      
      InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
      BufferedImage bImage2 = ImageIO.read(bis);
      image = bImage2;
      
      return image;
   }

    @Override
    public void getImage() throws IOException {
        imageReturn();
    }
}
