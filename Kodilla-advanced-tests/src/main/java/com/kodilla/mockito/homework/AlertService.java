package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {

    private Map<Civilian, Set<Alert>> civilianAlertMap = new HashMap<>();

    public void acceptAlert(Alert alert, Civilian civilian) {
        Set<Alert> acceptSubscription = this.civilianAlertMap.getOrDefault(civilian, new HashSet<>());

        acceptSubscription.add(alert);

        civilianAlertMap.put(civilian, acceptSubscription);
    }

    public void removeAlert(Alert alert, Civilian civilian) {
        Set<Alert> removeSubscription = this.civilianAlertMap.getOrDefault(civilian, new HashSet<>());

        removeSubscription.remove(alert);

        civilianAlertMap.put(civilian, removeSubscription);
    }

    public void removeAllAlert(Civilian civilian) {
        civilianAlertMap.remove(civilian);
    }

    public void sendAlertToAccepted(Alert alert) {
        this.civilianAlertMap.entrySet().stream()
                .filter(e -> e.getValue().contains(alert))
                .forEach(e -> e.getKey().receive(alert));
    }

    public void sendAlertToAll(Alert alert) {
        this.civilianAlertMap.entrySet().stream()
                .forEach(e -> e.getKey().receive(alert));
    }

    public void removeAllertFromAll(Alert alert) {
        civilianAlertMap.entrySet().stream()
                .forEach(n -> removeAlert(alert, n.getKey()));
    }

}
