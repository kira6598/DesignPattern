package DesignPatterns.StructuralPatterns.Proxy.VituralProxy.Client;

import DesignPatterns.StructuralPatterns.Proxy.VituralProxy.Proxy.ProxyImage;

public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("hehehe");
        proxyImage.showImage();
        proxyImage.showImage();
    }
}
