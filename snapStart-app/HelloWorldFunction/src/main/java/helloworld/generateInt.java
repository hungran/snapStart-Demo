package helloworld;

import java.io.IOException;
import java.security.SecureRandom;

public class generateInt {
   public static int generateRandomInterger() throws IOException {
      SecureRandom abc = new SecureRandom();
      return abc.nextInt();
   }
}
