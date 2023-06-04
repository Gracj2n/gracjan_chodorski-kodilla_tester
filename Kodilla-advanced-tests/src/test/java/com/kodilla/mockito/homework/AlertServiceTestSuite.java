package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    @Test
    public void civilianAcceptedAlertShouldReceiveOneLocationAlert() {
        AlertService alertService = new AlertService();

        Civilian civilian1 = Mockito.mock(Civilian.class);
        Alert alertFromWarszawa = Mockito.mock(Alert.class);

        alertService.acceptAlert(alertFromWarszawa, civilian1);

        alertService.sendAlert(alertFromWarszawa, civilian1);

        Mockito.verify(civilian1, Mockito.atMostOnce()).receive(alertFromWarszawa);
    }

    @Test
    public void civilianAcceptedAlertShouldReceiveMultiLocationAlert() {
        AlertService alertService = new AlertService();

        Civilian civilian1 = Mockito.mock(Civilian.class);
        Alert alertFromWarszawa = Mockito.mock(Alert.class);
        Alert alertFromKatowice = Mockito.mock(Alert.class);
        Alert alertFromGdansk = Mockito.mock(Alert.class);

        alertService.acceptAlert(alertFromWarszawa, civilian1);
        alertService.acceptAlert(alertFromKatowice, civilian1);
        alertService.acceptAlert(alertFromGdansk, civilian1);

        alertService.sendAlert(alertFromWarszawa, civilian1);
        alertService.sendAlert(alertFromKatowice, civilian1);
        alertService.sendAlert(alertFromGdansk, civilian1);

        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromWarszawa);
        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromKatowice);
        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromGdansk);
    }

    @Test
    public void civilianRemoveOneAlertShouldNotReceiveAlert() {
        AlertService alertService = new AlertService();

        Civilian civilian1 = Mockito.mock(Civilian.class);
        Alert alertFromWarszawa = Mockito.mock(Alert.class);
        Alert alertFromKatowice = Mockito.mock(Alert.class);
        Alert alertFromGdansk = Mockito.mock(Alert.class);

        alertService.acceptAlert(alertFromWarszawa, civilian1);
        alertService.acceptAlert(alertFromKatowice, civilian1);
        alertService.acceptAlert(alertFromGdansk, civilian1);

        alertService.removeAlert(alertFromWarszawa, civilian1);

        alertService.sendAlert(alertFromWarszawa, civilian1);
        alertService.sendAlert(alertFromKatowice, civilian1);
    }

    @Test
    public void civilianRemoveAllAlertsShouldNotReceiveAllAlerts() {
        AlertService alertService = new AlertService();

        Civilian civilian1 = Mockito.mock(Civilian.class);
        Alert alertFromWarszawa = Mockito.mock(Alert.class);
        Alert alertFromKatowice = Mockito.mock(Alert.class);
        Alert alertFromGdansk = Mockito.mock(Alert.class);

        alertService.acceptAlert(alertFromWarszawa, civilian1);
        alertService.acceptAlert(alertFromKatowice, civilian1);
        alertService.acceptAlert(alertFromGdansk, civilian1);

        alertService.removeAlert(alertFromWarszawa, civilian1);
        alertService.removeAlert(alertFromKatowice, civilian1);
        alertService.removeAlert(alertFromGdansk, civilian1);

        alertService.sendAlert(alertFromWarszawa, civilian1);
        alertService.sendAlert(alertFromKatowice, civilian1);
        alertService.sendAlert(alertFromGdansk, civilian1);

        Mockito.verify(civilian1, Mockito.never()).receive(alertFromWarszawa);
        Mockito.verify(civilian1, Mockito.never()).receive(alertFromKatowice);
        Mockito.verify(civilian1, Mockito.never()).receive(alertFromGdansk);
    }

    @Test
    public void alertShouldBeSendToAllCivilians() {
        AlertService alertService = new AlertService();

        Civilian civilian1 = Mockito.mock(Civilian.class);
        Civilian civilian2 = Mockito.mock(Civilian.class);
        Civilian civilian3 = Mockito.mock(Civilian.class);
        Alert alertFromWarszawa = Mockito.mock(Alert.class);
        Alert alertFromKatowice = Mockito.mock(Alert.class);
        Alert alertFromGdansk = Mockito.mock(Alert.class);

        //civilian1 accept all alerts
        alertService.acceptAlert(alertFromWarszawa, civilian1);
        alertService.acceptAlert(alertFromKatowice, civilian1);
        alertService.acceptAlert(alertFromGdansk, civilian1);

        //civilian2 accept all alerts
        alertService.acceptAlert(alertFromWarszawa, civilian2);
        alertService.acceptAlert(alertFromKatowice, civilian2);
        alertService.acceptAlert(alertFromGdansk, civilian2);

        //civilian3 accept all alerts
        alertService.acceptAlert(alertFromWarszawa, civilian3);
        alertService.acceptAlert(alertFromKatowice, civilian3);
        alertService.acceptAlert(alertFromGdansk, civilian3);

        //send all alerts to civilian1
        alertService.sendAlert(alertFromWarszawa, civilian1);
        alertService.sendAlert(alertFromKatowice, civilian1);
        alertService.sendAlert(alertFromGdansk, civilian1);

        //send all alerts to civilian2
        alertService.sendAlert(alertFromWarszawa, civilian2);
        alertService.sendAlert(alertFromKatowice, civilian2);
        alertService.sendAlert(alertFromGdansk, civilian2);

        //send all alerts to civilian3
        alertService.sendAlert(alertFromWarszawa, civilian3);
        alertService.sendAlert(alertFromKatowice, civilian3);
        alertService.sendAlert(alertFromGdansk, civilian3);

        //verify alert from Warszawa
        Mockito.verify(alertFromWarszawa, Mockito.atMostOnce()).sentTo(civilian1);
        Mockito.verify(alertFromWarszawa, Mockito.atMostOnce()).sentTo(civilian2);
        Mockito.verify(alertFromWarszawa, Mockito.atMostOnce()).sentTo(civilian3);

        //verify alert from Katowice
        Mockito.verify(alertFromKatowice, Mockito.atMostOnce()).sentTo(civilian1);
        Mockito.verify(alertFromKatowice, Mockito.atMostOnce()).sentTo(civilian2);
        Mockito.verify(alertFromKatowice, Mockito.atMostOnce()).sentTo(civilian3);

        //verify alert from Gdansk
        Mockito.verify(alertFromGdansk, Mockito.atMostOnce()).sentTo(civilian1);
        Mockito.verify(alertFromGdansk, Mockito.atMostOnce()).sentTo(civilian2);
        Mockito.verify(alertFromGdansk, Mockito.atMostOnce()).sentTo(civilian3);
    }

    @Test
    public void deleteAlertFromLocation() {

    }

}