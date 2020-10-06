//Kabrina Brady

import java.util.Scanner;

public class PasswordValidationBrady {
    public static void main(String[] args) {
        String password;
        String confirmPassword;
        Boolean valid = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password.");
        password = input.next();
        System.out.println("Confirm your password.");
        confirmPassword = input.next();

        valid = validatePassword(password, confirmPassword);

        if(valid){
            System.out.println("Password changed.");
        }
        else{
            System.out.println("Password does not meet validation requirements.");
        }
    }

    public static Boolean validatePassword(String password, String confirmPassword){
        Boolean validator = false;

        //Checks if passwords match
        if(!password.equals(confirmPassword)){
            return false;
        }
        //Checks password length
        if(password.length() < 8){
            return false;
        }
        //Checks if password contains digit
        for(int i = 0; i <= password.length(); i++){
            try{
                if(Character.isDigit(password.charAt(i))){
                    validator = true;
                    if (validator){
                        break;
                    }
                }
            }
            //Catches exception if "if" statement fails
            catch (Exception ex){
                return false;
            }
        }
        if(validator == false){
            return false;
        }
        //Checks if password contains lowercase
        for(int i = 0; i <= password.length(); i++){
            try{
                if(Character.isLowerCase(password.charAt(i))){
                    validator = true;
                    if (validator){
                        break;
                    }
                }
            }
            //Catches exception if "if" statement fails
            catch (Exception ex){
                return false;
            }
        }
        if(validator == false){
            return false;
        }
        //Checks if password contains uppercase
        for(int i = 0; i <= password.length(); i++){
            try{
                if(Character.isUpperCase(password.charAt(i))){
                    validator = true;
                    if (validator){
                        break;
                    }
                }
            }
            //Catches exception if "if" statement fails
            catch (Exception ex){
                return false;
            }
        }
        if(validator == false){
            return false;
        }
        else{
            return true;
        }
    }
}