/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipmessager;

import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class KeyboardInput implements MessageInput {

    private String message;
    Scanner keyboard = new Scanner(System.in);
    
    @Override
    public void setMessage() {
        System.out.println("Enter a Messige");
        message = keyboard.nextLine();
        
    }
    public String getMessage(){
        return message;
    }
    
}
