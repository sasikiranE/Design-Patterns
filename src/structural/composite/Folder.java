package structural.composite;

import java.util.ArrayList;

public class Folder implements FileSystemItem {
    private String name;
    private final ArrayList<FileSystemItem> members = new ArrayList<>(0);

    public Folder(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        this.members.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public long getSize() {
        long size = 0;
        for (FileSystemItem item : members) {
            size += item.getSize();
        }
        return size;
    }

    @Override
    public void print() {
        System.out.println(this);
        for (FileSystemItem item : members) {
            System.out.print("\t");
            item.print();
        }
    }

    @Override
    public int getCount() {
        int count = 0;
        for (FileSystemItem item : this.members) {
            count += item.getCount();
        }
        return count + this.members.size();
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                '}';
    }
}
