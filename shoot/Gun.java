/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shoot;

/**
 *
 * @author user
 */
public abstract class Gun extends ShootingDevice implements Killer{

    @Override
    public void shoot() {
        System.out.println("You are shooting by ");
        
    }
    
}
