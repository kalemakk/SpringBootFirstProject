package com.nyomPlanet.Model;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;
public class Service {
    private ServiceProvider serviceProvider;
    @Autowired
    public Service(ServiceProvider serviceProvider){
        this.serviceProvider = serviceProvider;
    }
    private UUID serviceId;
    private String serviceName;
    private double serviceCapacity;
    private double serviceAmount;
    private String serviceImageUrl;
    private String serviceOwner = serviceProvider.getServiceProviderName();


//    public ServiceProvider getServiceProvider() {
//        return serviceProvider;
//    }
//
//    public void setServiceProvider(ServiceProvider serviceProvider) {
//        this.serviceProvider = serviceProvider;
//    }

    public UUID getServiceId() {
        return serviceId;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCapacity() {
        return serviceCapacity;
    }

    public void setServiceCapacity(double serviceCapacity) {
        this.serviceCapacity = serviceCapacity;
    }

    public double getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public String getServiceImageUrl() {
        return serviceImageUrl;
    }

    public void setServiceImageUrl(String serviceImageUrl) {
        this.serviceImageUrl = serviceImageUrl;
    }
}
