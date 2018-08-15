/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;

/**
 *
 * @author 2105700
 */
public class searchServers extends Thread {

    HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
    
    private final int segmentoA, segmentoB;
    private int usedServers, busquedas;
    private final String ipAddress;
    private LinkedList<Integer> maliciousServers;

    public searchServers(int x, int y, String ip, LinkedList<Integer> maliciousServers) {
        segmentoA = x;
        segmentoB = y;
        ipAddress = ip;
        this.maliciousServers = maliciousServers;
    }

    @Override
    public void run() {
        for(int a = segmentoA; a < segmentoB; a++){
            usedServers++;
            if(skds.isInBlackListServer(a, ipAddress)){
                System.out.println("Servidor malicioso numero: " + a);
                maliciousServers.add(a);
                busquedas++;
            }
            
        }
    }

    public int numOcurrences(String ipAddress) {
        return 0;
    }

    public HostBlacklistsDataSourceFacade getSkds() {
        return skds;
    }

    public void setSkds(HostBlacklistsDataSourceFacade skds) {
        this.skds = skds;
    }

    public int getUsedServers() {
        return usedServers;
    }

    public void setUsedServers(int usedServers) {
        this.usedServers = usedServers;
    }

    public int getBusquedas() {
        return busquedas;
    }

    public void setBusquedas(int busquedas) {
        this.busquedas = busquedas;
    }

    public LinkedList<Integer> getMaliciousServers() {
        return maliciousServers;
    }

    public void setMaliciousServers(LinkedList<Integer> maliciousServers) {
        this.maliciousServers = maliciousServers;
    }  
}