package com.nyomPlanet.Dao;

import com.nyomPlanet.Model.ServiceProvider;

import java.util.List;

public interface ServiceProviderDao {
    public List<ServiceProvider> getCars();
    public List<ServiceProvider> getCakes();
    public List<ServiceProvider> getDecorators();
    public List<ServiceProvider> getMakeUp();
    public List<ServiceProvider> getSaloons();
    public List<ServiceProvider> getTents();
}
