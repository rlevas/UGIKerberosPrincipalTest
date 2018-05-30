package levas.ugikerberosprincipaltest;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

public class Main {
  public static void main(String[] args) throws IOException {

    // Enable Kerberos debugging
    System.setProperty("sun.security.krb5.debug", "true");

    String principalName = args[0];
    String keytabFilePath = args[1];

    Configuration conf = new Configuration();
    conf.set("hadoop.security.authentication", "kerberos"); // Enable Kerberos authentication

    UserGroupInformation.setConfiguration(conf);

    UserGroupInformation user = UserGroupInformation.loginUserFromKeytabAndReturnUGI(principalName, keytabFilePath);

    if (user != null) {
      System.out.print("Authenticated user: ");
      System.out.println(user.getUserName());
    } else {
      System.out.println("UGI is null");
    }
  }
}
