class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class VoterRegistration {
    void registerVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Registration failed! Age must be 18 or above.");
        } else {
            System.out.println("Registration successful! You are eligible to vote.");
        }
    }
}

public class w12_4 {
    public static void main(String[] args) {
        VoterRegistration voter = new VoterRegistration();

        try {
            voter.registerVoter(16);
            voter.registerVoter(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
