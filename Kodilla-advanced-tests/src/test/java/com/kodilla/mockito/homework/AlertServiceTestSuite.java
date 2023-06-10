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

        //alertService.sendAlert(alertFromWarszawa, civilian1);

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

//        alertService.sendAlert(alertFromWarszawa, civilian1);
//        alertService.sendAlert(alertFromKatowice, civilian1);
//        alertService.sendAlert(alertFromGdansk, civilian1);

        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromWarszawa);
        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromKatowice);
        Mockito.verify(civilian1, Mockito.atLeastOnce()).receive(alertFromGdansk);
    }

    @Test
    public void civilianRemoveOneAlertShouldNotReceiveAlert() {
        AlertService alertService = new AlertService();
//
//        Civilian civilian1 = Mockito.mock(Civilian.class);
//        Alert alertFromWarszawa = Mockito.mock(Alert.class);
//        Alert alertFromKatowice = Mockito.mock(Alert.class);
//        Alert alertFromGdansk = Mockito.mock(Alert.class);
//
//        alertService.acceptAlert(alertFromWarszawa, civilian1);
//        alertService.acceptAlert(alertFromKatowice, civilian1);
//        alertService.acceptAlert(alertFromGdansk, civilian1);
//
//        alertService.removeAlert(alertFromWarszawa, civilian1);
//
//        alertService.sendAlert(alertFromWarszawa, civilian1);
//        alertService.sendAlert(alertFromKatowice, civilian1);
    }

}