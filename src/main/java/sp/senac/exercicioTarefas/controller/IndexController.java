/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.exercicioTarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mario
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    
    public String index(){
        return "index";
    }
    
}
