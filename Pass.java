package PassCheck;

public class Pass {

    public String check(String password) {

        if (password.length() < 8) {
            return "Weak (too short)";
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int count = 0;
        if (hasLower) count++;
        if (hasUpper) count++;
        if (hasDigit) count++;
        if (hasSpecial) count++;

        if (count == 4) {
            return "Strong";
        } else if (count >= 2) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}
