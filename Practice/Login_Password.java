import javax.swing.JOptionPane;

   public class Login_Password {
  public static void main(String[] args) {
  int attempt = 0;
String username = "Naveen";
String password = "12345"; 
String usernameEntered;
String passwordEntered;

usernameEntered = (JOptionPane.showInputDialog("Please enter the username"));
passwordEntered = (JOptionPane.showInputDialog("Please enter the password"));
 if (usernameEntered.equals(username) && passwordEntered.equals(password) ){
     JOptionPane.showMessageDialog(null,"Credentials Match. Welcome Naveen!");    
}
 else if (usernameEntered.equals(username)) {
    JOptionPane.showMessageDialog(null,"Password Invalid.");
    attempt++;
    passwordEntered = (JOptionPane.showInputDialog("Please enter the password AGAIN"));
    }
else if (passwordEntered.equals(password)) {
    JOptionPane.showMessageDialog(null, "Username Invalid.");
    attempt++;
    usernameEntered = (JOptionPane.showInputDialog("Please enter username AGAIN"));
}
else {
    JOptionPane.showMessageDialog(null,"Both username and password are inncorrect. Who are you");
    attempt++;
    usernameEntered = (JOptionPane.showInputDialog("Please enter username AGAIN"));
    passwordEntered = (JOptionPane.showInputDialog("Please enter password AGAIN"));
}
    if (attempt == 5){
   JOptionPane.showMessageDialog(null,"You've reached maximum attempts. Program will now close");
   }
  }
 }