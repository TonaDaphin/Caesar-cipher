import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the plain text:");
        try {
            String plainText = bufferedReader.readLine();
            System.out.println("Please enter the shift key of your choice:");
            String stringKey = bufferedReader.readLine();
            int intKey = Integer.parseInt(stringKey);
            Encryption encrypt = new Encryption();
            System.out.println("The encrypted text is: " + encrypt.EncryptPlainText(plainText, intKey));
            String encryptedText = encrypt.EncryptPlainText(plainText, intKey);
            Decryption decrypt = new Decryption();
            System.out.println("The decrypted text is: " + decrypt.DecryptCipherText(encryptedText, intKey));
            System.out.println("There goes your Caesar Cipher program!!!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

