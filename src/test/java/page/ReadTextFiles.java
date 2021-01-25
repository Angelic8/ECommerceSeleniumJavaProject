package page;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFiles {

    protected static File file = new File("pass.txt");
    protected Scanner scan = new Scanner(file);

    protected String username = scan.next();
    protected String password = scan.next();

    public ReadTextFiles() throws FileNotFoundException {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

} // end class ReadTextFiles
