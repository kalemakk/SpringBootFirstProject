package com.nyomPlanet.Dao;
import com.nyomPlanet.Model.ServiceProvider;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServiceProviderDao {
    int insertServiceProvider(UUID id, ServiceProvider serviceProvider);

    default int insertServiceProvider(ServiceProvider serviceProvider){
        UUID personId = UUID.randomUUID();
        return insertServiceProvider(personId,serviceProvider);
    }
    List<ServiceProvider> getAllServiceProviders();
    int deleteServiceProvider(UUID id);
    int updateServiceProvider(UUID id, ServiceProvider serviceProvider);
    Optional<ServiceProvider> getServiceProviderById(UUID id);
}
