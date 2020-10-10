package com.nyomPlanet.Services;
import com.nyomPlanet.Dao.ServiceProviderDao;
import com.nyomPlanet.Model.ServiceProvider;
import org.paukov.combinatorics3.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NyomPlanetService {
    private final ServiceProviderDao serviceProviderDao;
    @Autowired
    public NyomPlanetService(@Qualifier("fake")ServiceProviderDao serviceProviderDao){
        this.serviceProviderDao = serviceProviderDao;
    }
    public List<Object> getServiceProviders(double enteredAmount){
        List<Object> selectedServiceProviders = new ArrayList<>();
        Generator.cartesianProduct(serviceProviderDao.getCars(),serviceProviderDao.getCakes(),serviceProviderDao.getDecorators(),serviceProviderDao.getSaloons(),serviceProviderDao.getTents())
                .stream().forEach(serviceProviders -> {
            double TotalCost = serviceProviders.parallelStream().mapToDouble(ServiceProvider::getServiceCost).sum();
            if (TotalCost<=enteredAmount) {
                selectedServiceProviders.add(serviceProviders);
            }
        });
        return selectedServiceProviders;
    }
}
