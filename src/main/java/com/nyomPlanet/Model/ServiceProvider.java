package com.nyomPlanet.Model;
import java.util.UUID;
public class ServiceProvider {
    private String serviceProviderName;
    private UUID serviceProviderId;
    private String serviceProviderLocation;
    private String serviceProviderContact;
    private int serviceCapacity;
    private double serviceCost;
    private ServiceType serviceType;

    public enum ServiceType{
        CAR,DECOR,MAKEUP,TENTS,SALOON,CAKE
    }
    public ServiceProvider(String serviceProviderName, UUID serviceProviderId, String serviceProviderLocation, String serviceProviderContact, int serviceCapacity, double serviceCost, ServiceType serviceType) {
        this.serviceProviderName = serviceProviderName;
        this.serviceProviderId = serviceProviderId;
        this.serviceProviderLocation = serviceProviderLocation;
        this.serviceProviderContact = serviceProviderContact;
        this.serviceCapacity = serviceCapacity;
        this.serviceCost = serviceCost;
        this.serviceType = serviceType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public UUID getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(UUID serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServiceProviderLocation() {
        return serviceProviderLocation;
    }

    public void setServiceProviderLocation(String serviceProviderLocation) {
        this.serviceProviderLocation = serviceProviderLocation;
    }

    public String getServiceProviderContact() {
        return serviceProviderContact;
    }

    public void setServiceProviderContact(String serviceProviderContact) {
        this.serviceProviderContact = serviceProviderContact;
    }

    public int getServiceCapacity() {
        return serviceCapacity;
    }

    public void setServiceCapacity(int serviceCapacity) {
        this.serviceCapacity = serviceCapacity;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
