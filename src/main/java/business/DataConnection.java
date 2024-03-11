package business;

import java.io.File;

public interface DataConnection {
    default File connectData(String path) {
        return new File(path);
    }
}
