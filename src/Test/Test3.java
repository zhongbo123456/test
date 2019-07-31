package Test;

import java.io.File;
import java.io.FileFilter;

public class Test3 {
    public static void main(String[] args) {
        File[] files=new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });


        File[] files1=new File(".").listFiles(File::isHidden);
    }

}
