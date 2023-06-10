package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {


    private Map<Civilian, Set<Alert>> civilianAlertMap = new HashMap<>();

    public void acceptAlert(Alert alert, Civilian civilian) {
        Set<Alert> sub = this.civilianAlertMap.get(civilian);
        sub.add(alert);

        civilianAlertMap.put(civilian, sub);
    }

    public void removeAlert(Alert alert, Civilian civilian) {
        Set<Alert> removeSub = this.civilianAlertMap.get(civilian);
        removeSub.remove(alert);

        civilianAlertMap.put(civilian, removeSub);
    }
    public void removeAllAlert(Civilian civilian) {
        civilianAlertMap.remove(civilian);
    }

    public void sendAlert(Alert alert) {
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
