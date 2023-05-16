package DesignPatterns.StructuralPatterns.Proxy.VituralProxy.RealSubject;

import DesignPatterns.StructuralPatterns.Proxy.VituralProxy.Subject.Image;

public class RealImage implements Image {

    private String url;
    
    public RealImage(String url) {
        this.url = url;
        System.out.println("Image loaded: "+ this.url );
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: "+ this.url );

    }
    
}
