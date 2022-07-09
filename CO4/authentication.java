import java.util.Scanner;

class username extends Exception {
    String user;

    username(String us) {
        user = us;
    }

    public String userExp() {
        return "usernameError[" + user + "]";
    }
}

class Password extends Exception {
    String passwd;

    Password(String ps) {
        passwd = ps;
    }

    public String passExp() {
        return "PasswordError[" + passwd + "]";
    }
}

public class authentication {
    static void check(String u, String p) throws username, Password {
        if (!u.equals("Ram@akg")) {
            throw new username(u);
        } else if (!p.equals("ram123")) {
            throw new Password(p);
        } else {
            System.out.println("Auntentication Success!!!");
        }
    }

    public static void main(String[] args) {
        try {
            String u, p;
            Scanner sc = new Scanner(System.in);
            System.out.println("Username : ");
            u = sc.nextLine();
            System.out.println("Password : ");
            p = sc.nextLine();
            check(u, p);
        } catch (username e) {
            System.out.println("Invalid Username!!!");
        } catch (Password e) {
            System.out.println("Invalid Password!!!");
        }
    }
}
