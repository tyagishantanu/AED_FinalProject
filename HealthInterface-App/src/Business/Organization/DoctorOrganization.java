/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author jazibjavaid
 */
public class DoctorOrganization extends Organization{
    
    public DoctorOrganization(String name) {
        super(name);
    }
    
    @Override
    public OrgType getOrgType() {
        return Organization.OrgType.Doctor;
    }
}