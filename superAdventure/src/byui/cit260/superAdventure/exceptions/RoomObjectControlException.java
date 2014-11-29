/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.exceptions;

/**
 *
 * @author Daniel
 */
public class RoomObjectControlException extends Exception{

    public RoomObjectControlException() {
    }

    public RoomObjectControlException(String message) {
        super(message);
    }

    public RoomObjectControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoomObjectControlException(Throwable cause) {
        super(cause);
    }

    public RoomObjectControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
    
}
