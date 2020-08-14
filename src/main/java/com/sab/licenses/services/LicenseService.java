package com.sab.licenses.services;

import com.sab.licenses.model.License;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class LicenseService {
    License getLicense(String licenseId){
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        return new License()
                .withId(licenseId)
                .withLicenseType("PerSeat")
                .withProductName("Test Product Name")
                .withOrganisationId(uuid);
    }

}
