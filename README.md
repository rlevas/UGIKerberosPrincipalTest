# UGIKerberosPrincipalTest
Tests obtaining the user's identity based on a Kerberos principal name and keytab file

The default logging level is set to **DEBUG** and the logging level of the classes in the 
**org.apache.hadoop.security** packages is set to **TRACE** inorder to help debug any potential issues.
  

### Build

    mvn clean package
  

### Execute
  
    ${JAVA_HOME}/bin/java -jar UGIKerberosPrincipalTest-assembly.jar <principal name> <keytab file path>
    
##### Example 
    
    /usr/jdk64/jdk1.8.0_112/bin/java -jar ./UGIKerberosPrincipalTest-assembly.jar rlevas@EXAMPLE.COM rlevas.keytab
    
    
  