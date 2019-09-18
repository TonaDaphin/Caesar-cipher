public class Encryption {
    public String EncryptPlainText(String plainText, int key){
        String encryptedMessage = "";
        char ch;

        for(int i = 0; i < plainText.length(); i++){
            ch = plainText.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMessage += ch;
            }
        }
        return  encryptedMessage;
    }
}

//Code source: "https://www.thejavaprogrammer.com/caesar-cipher-java-encryption-decryption/"