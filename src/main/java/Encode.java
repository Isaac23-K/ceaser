public class Encode {

    public static StringBuffer encoding(String plainText, int key){

        //Encode the text
        StringBuffer encode = new StringBuffer();
        for (int i = 0; i < plainText.length(); i++){

            //Check if text is upper case
            if (Character.isUpperCase(plainText.charAt(i))){
                char c = (char) (((int)plainText.charAt(i) + key -65) % 26 + 65);
                encode.append(c);

                //Check if text is lower case
            } else {
                char c = (char) (((int)plainText.charAt(i) + key -97) % 26 + 97);
                encode.append(c);

            }
        }

        return encode;

    }

}