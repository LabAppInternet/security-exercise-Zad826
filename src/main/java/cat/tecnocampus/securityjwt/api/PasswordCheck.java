package cat.tecnocampus.securityjwt.api;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordCheck {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String plainPassword = "johndoe2000";
        String rawPasswordEncrypted = encoder.encode(plainPassword);
        System.out.println(rawPasswordEncrypted);
        boolean matches = encoder.matches(plainPassword, "$2a$10$Bbh5Q/jhVbb8Ej2gUjpmWux6oBRC/l2YgCypupwBcqB2radF.pkl6");
        if (matches) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
    }
}

