package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {

    private Map<Alert, Civilian> civilianAlertsMap = new HashMap<>();

    public void acceptAlert(Alert alert, Civilian civilian) {
        this.civilianAlertsMap.put(alert, civilian);
    }

    public void removeAlert(Alert alert, Civilian civilian) {
        this.civilianAlertsMap.remove(alert, civilian);
    }

    public void sendAlert(Alert alert, Civilian civilian) {
        this.civilianAlertsMap.forEach((alert1, civilian1) -> civilian.receive(alert));
    }
}
