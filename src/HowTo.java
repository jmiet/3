package zad3;

/**
 * Created by A on 2016-01-25.
 */
public class HowTo {
    String fileName;
    String outputFileName;
    String errorsFileName;
    int rowsPerFile;

    HowTo(String f, String o, String e, int r){
        this.fileName = f;
        this.outputFileName = o;
        this.errorsFileName = e;
        this.rowsPerFile=r;
    }
}
