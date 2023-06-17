package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Civilian civilian1 = Mockito.mock(Civilian.class);
    Civilian civilian2 = Mockito.mock(Civilian.class);
    Civilian civilian3 = Mockito.mock(Civilian.class);
    Alert alert1 = Mockito.mock(Alert.class);
    Alert alert2 = Mockito.mock(Alert.class);
    Alert alert3 = Mockito.mock(Alert.class);

    @Test
    public void shouldSendAlertToCivilianIfAcceptAlert() {
        alertService.acceptAlert(alert1, civilian1);
        alertService.sendAlertToAccepted(alert1);

        Mockito.verify(civilian1, Mockito.atMostOnce()).receive(alert1);
    }

    @Test
    public void removeAlert() {
        alertService.acceptAlert(alert1, civilian1);
        alertService.removeAlert(alert1, civilian1);
        alertService.sendAlertToAccepted(alert1);

        Mockito.verify(civilian1, Mockito.never()).receive(alert1);
    }

    @Test
    public void removeAllAlert() {
        alertService.acceptAlert(alert1, civilian1);
        alertService.acceptAlert(alert2, civilian1);
        alertService.acceptAlert(alert3, civilian1);

        alertService.removeAllAlert(civilian1);

        alertService.sendAlertToAccepted(alert1);
        alertService.sendAlertToAccepted(alert2);
        alertService.sendAlertToAccepted(alert3);

        Mockito.verify(civilian1, Mockito.never()).receive(alert1);
        Mockito.verify(civilian1, Mockito.never()).receive(alert2);
        Mockito.verify(civilian1, Mockito.never()).receive(alert3);
    }

    @Test
    public void sendAlertToAll() {
        alertService.sendAlertToAll(alert1);

        Mockito.verify(civilian1, Mockito.atMostOnce()).receive(alert1);
        Mockito.verify(civilian2, Mockito.atMostOnce()).receive(alert1);
        Mockito.verify(civilian3, Mockito.atMostOnce()).receive(alert1);
    }

    @Test
    public void removeAllertFromAll() {
        alertService.acceptAlert(alert1, civilian1);
        alertService.acceptAlert(alert1, civilian2);
        alertService.acceptAlert(alert1, civilian3);

        alertService.removeAllertFromAll(alert1);

        alertService.sendAlertToAccepted(alert1);

        Mockito.verify(civilian1, Mockito.never()).receive(alert1);
        Mockito.verify(civilian2, Mockito.never()).receive(alert1);
        Mockito.verify(civilian3, Mockito.never()).receive(alert1);
    }
}