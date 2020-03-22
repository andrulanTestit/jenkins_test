package education.fabrika;

import java.util.function.Consumer;

public class Fabrika {

    public static Reader getReader(ReaderType readerType) {
        switch (readerType) {
            case BMP:
            case PNG:
            case JPEG:
            default:
                throw new IllegalArgumentException("Exception");
        }

    }

    public static enum ReaderType {
        BMP,
        PNG,
        JPEG;
    }
}
