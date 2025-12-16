interface AuthService {
    boolean login(String user, String pass);
}

class SimpleAuthService implements AuthService {
    public boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }
}

class AuthController {
    private AuthService service;

    AuthController(AuthService service) {
        this.service = service;
    }

    void authenticate(String u, String p) {
        if (service.login(u, p))
            System.out.println("Login success");
        else
            System.out.println("Invalid credentials");
    }
}

public class RealWorldOOPDemo {
    public static void main(String[] args) {
        AuthController controller =
                new AuthController(new SimpleAuthService());

        controller.authenticate("admin", "1234");
        controller.authenticate("admin", "wrong");
    }
}
