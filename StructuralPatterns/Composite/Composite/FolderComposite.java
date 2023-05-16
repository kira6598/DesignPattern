package DesignPatterns.StructuralPatterns.Composite.Composite;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.StructuralPatterns.Composite.BaseComponent.FileComponent;

public class FolderComposite implements FileComponent{

    List<FileComponent> files = new ArrayList<>();
    

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
       for (FileComponent fileComponent : files) {
            fileComponent.showProperty();
       }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent fileComponent : files) {
            total+=fileComponent.totalSize();
        }
        return total;
    }
    
}
