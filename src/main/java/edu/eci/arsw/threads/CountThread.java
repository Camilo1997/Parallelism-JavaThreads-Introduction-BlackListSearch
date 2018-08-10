/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{

    private final int a, b;
    
    public CountThread(int a, int b) {
        this.a = a;
        this.b = b;    
    }

    @Override
    public void run() {
        for(int x = a; x <= b; x++){
            System.out.println("Numero: " + x);
        }
    }
}
