package org.example.structural.composite;

public class File implements FileSystemComponent {
    String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void showDetails() {
        System.out.println("File : " + fileName);
    }
}
