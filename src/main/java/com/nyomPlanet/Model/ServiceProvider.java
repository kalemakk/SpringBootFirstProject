package com.nyomPlanet.Model;

import java.util.UUID;

public class ServiceProvider {
    private UUID serviceProviderId;
    private String serviceProviderContact;
    private String serviceProviderAddress;
    private String serviceProviderName;

    public UUID getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(UUID serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServiceProviderContact() {
        return serviceProviderContact;
    }

    public void setServiceProviderContact(String serviceProviderContact) {
        this.serviceProviderContact = serviceProviderContact;
    }

    public String getServiceProviderAddress() {
        return serviceProviderAddress;
    }

    public void setServiceProviderAddress(String serviceProviderAddress) {
        this.serviceProviderAddress = serviceProviderAddress;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }
}
