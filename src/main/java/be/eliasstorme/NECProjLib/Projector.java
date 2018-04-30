package be.eliasstorme.NECProjLib;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.EnumMap;
import java.util.HashMap;

/**
 * Created by elias on 25/03/18.
 */
public class Projector {



    /********************
     * Constructor
     ********************/

    public Projector(String hostname)
            throws IOException, IllegalArgumentException{
        /**
         * Parse and ping hostname
         */
        try{
            projAddress = InetAddress.getByName(hostname);
            if(!projAddress.isReachable(1000))
                throw new IllegalArgumentException("main.java.be.eliasstorme.NECProjLib.Projector not reachable.");
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(
                    "Invalid hostname format: " + e.getMessage());
        }
        /**
         * Establish connection to projector and get its status.
         */
    }

    /********************
     * Constants
     ********************/

    private HashMap <String,EnumMap<CommandDataType,Number>>
            COMMANDS = new HashMap<>();
    static{

    }

    /********************
     * Auxiliary methods
     ********************/

    /**
     * Establish a connection and
     * @return
     * @throws IOException
     */
    private Socket establishConnection() throws IOException{
        return null;
    }

    private String sendCommand(String command) throws IOException{
        try(Socket s = establishConnection()){

        }
        return "";
    }

    private byte[] buildCommand(String name, byte[] data){
        return new byte[5];
    }

    private byte[] buildCommand(String name){
        return buildCommand(name, new byte[0]);
    }

    /********************
     * Networking
     ********************/

    private final InetAddress projAddress;

    public InetAddress getProjAddress() {
        return projAddress;
    }

    public void sendCommand(byte[] command){

    }

    /********************
     * Power
     ********************/

    private boolean isPoweredOn;

    public void powerOn(){
        if(!isPoweredOn()){
            setPoweredOn(true);
        }
    }

    public void powerOff(){
        if(isPoweredOn()){
            setPoweredOn(false);
        }
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    private void setPoweredOn(boolean poweredOn) {
        isPoweredOn = poweredOn;
    }

    /********************
     * Input
     ********************/

    private static final HashMap<String,Byte> INPUTS
            = new HashMap<>();
    static{
        INPUTS.put("Computer 1", (byte) 0x01);
        INPUTS.put("Computer 2", (byte) 0x02);
    }

    private String input;

    /********************
     * AVMute
     ********************/

    private boolean isMuted;

}
