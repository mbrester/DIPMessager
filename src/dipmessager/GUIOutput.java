/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipmessager;
import javax.swing.JOptionPane;
/**
 *
 * @author Mitch
 */
public class GUIOutput implements MessageOutput{

    @Override
    public void sendMessage(String message) {
       JOptionPane.showMessageDialog(null, message);
    }
    
}
