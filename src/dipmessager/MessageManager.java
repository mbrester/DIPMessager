/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipmessager;

/**
 *
 * @author Mitch
 */
public class MessageManager {
    private MessageInput input = new KeyboardInput();
    private MessageOutput output = new ConsoleOutput();
    
    public void ProsessMessage(){
        input.setMessage();
        output.sendMessage(input.getMessage());
        
    }
    
    
}
