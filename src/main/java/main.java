import events.MessageReceivedEventListener;
import events.ReadyEventListener;
import client.ClientManager;

import java.util.Scanner;

/**
 * Created by Phost on 21.01.2017.
 */
public class main {

    public static boolean realeasemode = false;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ClientManager.setDeveloperMode(true);
        if(!ClientManager.getDeveloperMode())
            ClientManager.newClientInstance(scanner.next(), true);
        else
            ClientManager.newClientInstance(scanner.next(), true);
        ClientManager.newDispatcher();
        ClientManager.getDispatcher().registerListener(new ReadyEventListener());
        ClientManager.getDispatcher().registerListener(new MessageReceivedEventListener());

    }
}
