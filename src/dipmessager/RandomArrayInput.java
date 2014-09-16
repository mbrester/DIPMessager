/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dipmessager;
import java.util.Random;

/**
 *
 * @author Mitch
 */
public class RandomArrayInput implements MessageInput{

    private String message;
    private String[] random = {"Hello","Welcome","You are great","You have eyes","Ummm W"};
    private Random rand = new Random();
    int randomInt = rand.nextInt(5);
     @Override
    public void setMessage() {
      this.message = random[randomInt];
    }

    @Override
    public String getMessage() {
       return message;
    }
    
}
