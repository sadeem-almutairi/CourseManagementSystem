/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseregistration;

/**
 *
 * @author Hajar Alhajri
 *
 */
import java.util.ArrayList;
public class RegistrationManagement {
    private ArrayList<Registration>  registrationList;
    public RegistrationManagement(){
    registrationList= new ArrayList<>();
   
    }
    public boolean addRegistration(Registration registration){
    for(Registration r: registrationList){
    if (r.getStudentId().equals(registration.getStudentId())&& r.getCourseId()==registration.getCourseId()){
    return false;
    }
    
    }
    registrationList.add(registration);
    return true;
    }
    public Registration searchRegistration(String registrationId){
    for (Registration r:registrationList){
    if(r.getRegistrationId().equalsIgnoreCase(registrationId)){
    return r;
    }
    
    }
    return null;
    }
    public boolean deleteRegistration(String registrationId){
    Registration registration = searchRegistration(registrationId);
    if (registration != null){
    registrationList.remove(registration);
    return true;
    
    }
    return false;
    }
    public boolean updateRegistration(Registration registration) {

    Registration oldRegistration = searchRegistration(registration.getRegistrationId());

    if (oldRegistration != null) {

        oldRegistration.setStudentId(registration.getStudentId());

        oldRegistration.setStudentName(registration.getStudentName());

        oldRegistration.setCourseId(registration.getCourseId());

        

        oldRegistration.setCourseCode(registration.getCourseCode());

        oldRegistration.setSemester(registration.getSemester());

        oldRegistration.setRegistrationDate(registration.getRegistrationDate());

        oldRegistration.setRegistrationStatus(registration.getRegistrationStatus());

        return true;

    }

    return false;

    }
}
