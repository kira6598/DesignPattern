package DesignPatterns.StructuralPatterns.Composite.Client;

import java.util.Arrays;
import java.util.List;

import DesignPatterns.StructuralPatterns.Composite.BaseComponent.FileComponent;
import DesignPatterns.StructuralPatterns.Composite.Composite.FolderComposite;
import DesignPatterns.StructuralPatterns.Composite.Leaf.FileLeaf;

public class Client {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("leaf1", 2);
        FileComponent file2 = new FileLeaf("leaf2", 2);
        FileComponent file3 = new FileLeaf("leaf3", 2);

        List<FileComponent> files = Arrays.asList(file1,file2,file3);
        FolderComposite folderComposite = new FolderComposite(files);
        folderComposite.showProperty();
        System.out.println( folderComposite.totalSize());
    }
}
