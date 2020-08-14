package com.sab.licenses.controllers;

import com.sab.licenses.model.License;
import com.sab.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/organisation/{organisationId}/licenses")
public class LicenseServiceController {
//    @Autowired
//    LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}")
    public License getLicenses(@PathVariable("organisationId") String organisationId,@PathVariable("licenseId") String LicenseId){
        return new License().withId(LicenseId).withOrganisationId(organisationId).withProductName("Seat").withLicenseType("Top Seat").withLicenseType("am done");
    }
}
