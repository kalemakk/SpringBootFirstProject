package com.nyomPlanet.Dao;

import com.nyomPlanet.Model.ServiceProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Repository("fake")
public class Fake implements ServiceProviderDao{
    List<ServiceProvider> serviceProviderList = List.of(
            new ServiceProvider("arnoldKK", UUID.randomUUID(),"Kampala, Ntinda","+256-781-116-999",200,100, ServiceProvider.ServiceType.CAR),
            new ServiceProvider("kalema", UUID.randomUUID(),"Kampala, Ntinda","+256-745-556-111",5,10, ServiceProvider.ServiceType.CAKE),
            new ServiceProvider("arnoldKK", UUID.randomUUID(),"Kampala, Nakawa","+256-781-116-999",0,30, ServiceProvider.ServiceType.DECOR),
            new ServiceProvider("arnoldKK", UUID.randomUUID(),"Kampala, Makerere","+256-781-116-999",0,100, ServiceProvider.ServiceType.DECOR)
    );

    public List<ServiceProvider> getCars(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.CAR)).collect(Collectors.toList());
    }
    public List<ServiceProvider> getCakes(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.CAKE)).collect(Collectors.toList());
    }
    public List<ServiceProvider> getDecorators(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.DECOR)).collect(Collectors.toList());
    }
    public List<ServiceProvider> getMakeUp(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.MAKEUP)).collect(Collectors.toList());
    }
    public List<ServiceProvider> getSaloons(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.SALOON)).collect(Collectors.toList());
    }
    public List<ServiceProvider> getTents(){
        return serviceProviderList.stream().filter(serviceProvider -> serviceProvider.getServiceType().equals(ServiceProvider.ServiceType.TENTS)).collect(Collectors.toList());
    }

}
