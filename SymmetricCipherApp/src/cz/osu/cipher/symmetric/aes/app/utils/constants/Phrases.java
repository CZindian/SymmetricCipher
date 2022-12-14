package cz.osu.cipher.symmetric.aes.app.utils.constants;

import cz.osu.cipher.symmetric.aes.app.model.Mode;

/**
 * Class for keeping constant phrases that may be used more than once
 * for console interaction with user
 */
public class Phrases {

    public static final String INTRO_COMMAND = "Choose 'd' for decryption or 'e' for encryption:";
    public static final String SPECIES_INTRO_COMMAND = "Choose 'f' for a file or 't' for text:'";
    public static final String MODE_INTRO_COMMAND = "Type '" + Mode.CBC.name() + "' or '" + Mode.CFB.name() + "' upper or lower case:";
    public static final String CIPHER_KEY_LENGTH_COMMAND = "Choose length of cipher key (128, 192, 256):";
    public static final String COMPLETE_FILE_PATH_COMMAND = "Type complete path to your file:";
    public static final String EXAMPLE_FILE_PATH_COMMAND = "\t-example: C:\\user\\data\\file.txt";


}
