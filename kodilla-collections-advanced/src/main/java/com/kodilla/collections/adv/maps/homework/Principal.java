package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalName;
    private String getPrincipalLastName;

    public Principal(String principalName, String getPrincipalLastName) {
        this.principalName = principalName;
        this.getPrincipalLastName = getPrincipalLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName) && Objects.equals(getPrincipalLastName, principal.getPrincipalLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName, getPrincipalLastName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                ", getPrincipalLastName='" + getPrincipalLastName + '\'' +
                '}';
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getGetPrincipalLastName() {
        return getPrincipalLastName;
    }
}
