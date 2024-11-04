package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Folder implements FileSystemComponent {
    String folderName;

    public List<FileSystemComponent> getFileSystemComponentList() {
        return fileSystemComponentList;
    }

    public void setFileSystemComponentList(List<FileSystemComponent> fileSystemComponentList) {
        this.fileSystemComponentList = fileSystemComponentList;
    }

    List<FileSystemComponent> fileSystemComponentList = new ArrayList<>();
    public Folder(String folderName) {
        this.folderName = folderName;
    }
    @Override
    public void showDetails() {
        System.out.println("Folder : " + folderName + " starts ...");
        fileSystemComponentList.
                stream()
                .filter(Objects::nonNull)
                .forEach(fileSystemComponent -> {
                    fileSystemComponent.showDetails();
                });
        System.out.println("Folder : " + folderName + " ends ...");
    }
}
