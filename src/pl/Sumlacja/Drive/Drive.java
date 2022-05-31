package pl.Sumlacja.Drive;

import pl.Sumlacja.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
