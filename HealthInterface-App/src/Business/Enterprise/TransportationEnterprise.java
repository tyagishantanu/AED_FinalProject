/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class TransportationEnterprise extends Enterprise {
    
    public TransportationEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseCategory.Transportation, name, contactNumber, email, address, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
