/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Inc;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author A7mady
 */
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        register(new MyApplicationBinder());
        packages(true, "Inventory.Inc");
    }
}
