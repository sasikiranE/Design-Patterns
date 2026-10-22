package structural.composite;

public class File implements FileSystemItem {

    private long size;
    private String name;

    public File(String name, long size) {
        this.name = name;
        this.size =size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public void print() {
        System.out.println("\t" + this);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
