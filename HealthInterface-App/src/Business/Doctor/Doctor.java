/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkProcess.HealthRequestDirectory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author shantanutyagi
 */
public class Doctor extends Business.Person.Person{
    
    private String degree;
    private String hospital;
    private String designation;
    private String yearsExperience;
    private Organization orgCategory;
    private Boolean availability;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private HealthRequestDirectory requestDirectory;
    
     public Doctor(String degree, String hospital, String designation, String yearsExperience, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role, Organization orgCategory) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
        this.degree = degree;
        this.hospital = hospital;
        this.designation = designation;
        this.yearsExperience = yearsExperience;
        this.id=count.incrementAndGet(); 
        this.orgCategory = orgCategory;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public Organization getOrgCategory() {
        return orgCategory;
    }

    public void setOrgCategory(Organization orgCategory) {
        this.orgCategory = orgCategory;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public HealthRequestDirectory getRequestDirectory() {
        if(requestDirectory==null){
            requestDirectory = new HealthRequestDirectory();
        }
        return requestDirectory;
    }
}
