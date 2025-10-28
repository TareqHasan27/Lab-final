package simplejavacalculator.Proxy;

import simplejavacalculator.BufferedImageCustom;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

public class ProxyImageservice implements Imageservice {
    BufferedImageCustom bufferedImageCustom;
    ProxyImageservice(BufferedImageCustom bufferedImageCustom) {
        this.bufferedImageCustom = bufferedImageCustom;
    }
    private Map<String, BufferedImage> images;
    @Override
    public void getImage() throws IOException {
        if(images.containsKey("image1")))
        {
            System.out.println("Image already exists");
        }else {
            bufferedImageCustom.getImage();
        }
    }
}
