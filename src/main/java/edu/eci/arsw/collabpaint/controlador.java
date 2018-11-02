/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.collabpaint;

import edu.eci.arsw.collabpaint.model.Point;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 *
 * @author 2092692
 */
@Controller
public class controlador {
    @MessageMapping("/hello")
    @SendTo("/topic/newpoint")
    public String mensajePoint(Point mensaje) throws InterruptedException{
        Thread.sleep(1000);
        return mensaje.toString();
    }
}
