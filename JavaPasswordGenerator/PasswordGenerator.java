import java.security.SecureRandom;

public class PasswordGenerator {
    private int length;
    private boolean includeUppercase;
    private boolean includeLowercase;
    private boolean includeDigits;
    private boolean includeSpecialCharacters;

    private final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private final String DIGIT_CHARS = "0123456789";
    private final String SPECIAL_CHARS = "!@#$%^&*()_-+=<>?/{}~";

    public PasswordGenerator(int length, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecialCharacters) {
        this.length = length;
        this.includeUppercase = includeUppercase;
        this.includeLowercase = includeLowercase;
        this.includeDigits = includeDigits;
        this.includeSpecialCharacters = includeSpecialCharacters;
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        String validChars = "";

        if (includeUppercase) {
            validChars += UPPERCASE_CHARS;
        }

        if (includeLowercase) {
            validChars += LOWERCASE_CHARS;
        }

        if (includeDigits) {
            validChars += DIGIT_CHARS;
        }

        if (includeSpecialCharacters) {
            validChars += SPECIAL_CHARS;
        }

        if (validChars.isEmpty()) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}