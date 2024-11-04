package org.example.structural.composite;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        File fileA = new File("FileA");
        File fileB = new File("FileB");
        File fileC = new File("FileC");
        Folder folderA = new Folder("FolderA");
        Folder folderB = new Folder("FolderB");
        folderA.setFileSystemComponentList(Arrays.asList(fileA, fileB));
        folderB.setFileSystemComponentList(Arrays.asList(folderA, fileC));
        folderB.showDetails();
    }
}
