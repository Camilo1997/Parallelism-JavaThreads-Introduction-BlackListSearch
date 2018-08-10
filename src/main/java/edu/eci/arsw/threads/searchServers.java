/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;
import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

/**
 *
 * @author 2105700
 */
public class searchServers extends Thread {

    HostBlackListsValidator x;
    private final int segmentoA, segmentoB;

    public searchServers(int x, int y) {
        segmentoA = x;
        segmentoB = y;
    }

    @Override
    public void run() {
        System.out.println("Thread funcionando");
    }

    public int numOcurrences(String ipAddress) {
        return 0;
    }
}