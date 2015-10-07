package org.untukpati.models;


public class ServicesModel {

    private String serviceName;
    private String serviceAddress;
    private String serviceTelp;
    private String serviceEmail;
    private String serviceInfo;

    public ServicesModel(String serviceName, String serviceAddress, String serviceTelp,
                         String serviceEmail, String serviceInfo) {

        this.serviceName = serviceName;
        this.serviceAddress = serviceAddress;
        this.serviceTelp = serviceTelp;
        this.serviceEmail = serviceEmail;
        this.serviceInfo = serviceInfo;

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getServiceTelp() {
        return serviceTelp;
    }

    public void setServiceTelp(String serviceTelp) {
        this.serviceTelp = serviceTelp;
    }

    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }
}
