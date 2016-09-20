package ru.schurbanov;

/**
 * Created by schurbanov on 9/14/2016.
 */
public class ConnectionManager {
    public static Connection[] OpenedConnections=null;
    public static int ConnectionsUsed = 0;
    private static int ConnectionsAsked = 0;

    public ConnectionManager(int cNumber) {
        if (cNumber > 0) {
            OpenedConnections = new Connection[cNumber];
            for (int j = 0; j < cNumber; j++) {
                OpenedConnections[j] = new Connection();
            }
        }
    }

    public static Connection GetConnection() {
        ConnectionsAsked++;
        if (ConnectionsUsed < OpenedConnections.length) {
            ConnectionsUsed++;
            return OpenedConnections[ConnectionsUsed-1];
        } else {
            return null;
        }
    }
}