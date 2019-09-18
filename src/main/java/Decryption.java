public class Decryption {
    private  String text;
    public String DecryptCipherText(String cipherText, int key){
        String decryptedMessage = "";
        char ch;

        for(int i = 0; i < cipherText.length(); ++i){
            ch = cipherText.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - key);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                decryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                decryptedMessage += ch;
            }
        }
        return  decryptedMessage;
    }
}

