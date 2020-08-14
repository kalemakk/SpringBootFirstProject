package com.sab.licenses.model;

public class License {
    private String id;
    private String organisationId;
    private String productName;
    private String licenseType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
    public License withId(String id){
        this.setId(id);
        return this;
    }
    public License withOrganisationId(String organisationId){
        this.setOrganisationId(organisationId);
        return this;
    }
    public License withProductName(String productName){
        this.setProductName(productName);
        return this;
    }    public License withLicenseType(String licenseType){
        this.setLicenseType(licenseType);
        return this;
    }
}
