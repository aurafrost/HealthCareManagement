package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.HealthService;
@Controller
public class MainController {
	@Autowired
	HealthService hs;
	@RequestMapping("home")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/index.jsp");
	}
	//redirects to the DrugEntry.jsp page
	@RequestMapping("showentry")
	public ModelAndView doEntry() {
		return new ModelAndView("DrugEntry.jsp","command",new Drug());
	}
	@RequestMapping(value="entry",method=RequestMethod.POST)
	public ModelAndView entry(@ModelAttribute("Drug") Drug drug) {
		hs.add(drug);
		return new ModelAndView("success.jsp","msg", "Drug named "+drug.getDrugName()+" has been added.");
	}
	//redirects to the UpdateEntry.jsp page
	@RequestMapping("showupdate")
	public ModelAndView doUpdateEntry() {
		return new ModelAndView("UpdateEntry.jsp","command",new Drug());
	}
	@RequestMapping("update")
	public ModelAndView updateEntry(@ModelAttribute("Drug") Drug drug) {
		hs.update(drug);
		return new ModelAndView("success.jsp","msg", "Drug named "+drug.getDrugName()+" is updated.");
	}
	@RequestMapping("stock")
	public ModelAndView stockDetails() {
		List<Drug>d=hs.getStockDetails();
		return new ModelAndView("StockDetails.jsp","list",d);
	}
	//redirects to the InPatientStudentEntry.jsp page
	@RequestMapping("showInPatientStudent")
	public ModelAndView doPatientStudent() {
		return new ModelAndView("InPatientStudentEntry.jsp","command",new PatientStudent());
	}
	@RequestMapping(value="PatientStudentEntry",method=RequestMethod.POST)
	public ModelAndView inPatientStudent(@ModelAttribute("PatientStudent") PatientStudent patient) {
		hs.add(patient);
		return new ModelAndView("success.jsp","msg", "Patient named "+patient.getPatientName()+" has been added.");
	}
	//redirects to the InPatientStudentEntry.jsp page
	@RequestMapping("showInPatientEB")
	public ModelAndView doPatientEB() {
		return new ModelAndView("InPatientEmployeeEntry.jsp","command",new PatientEmployee());
	}
	@RequestMapping(value="PatientEmployeeEntry",method=RequestMethod.POST)
	public ModelAndView inPatientEmployee(@ModelAttribute("PatientEmployee") PatientEmployee patient) {
		patient.setDaysInHospital(1);
		hs.add(patient);
		return new ModelAndView("success.jsp","msg", "Patient named "+patient.getPatientName()+" has been added.");
	}
	//redirects to the OutPatientEntry.jsp page
	@RequestMapping("showOutPatient")
	public ModelAndView doOutPatient() {
		return new ModelAndView("OutPatientEntry.jsp","command",new OutPatient());
	}
	@RequestMapping(value="outPatient",method=RequestMethod.POST)
	public ModelAndView outPatient(@ModelAttribute("OutPatient") OutPatient patient) {
		hs.add(patient);
		return new ModelAndView("success.jsp","msg", "Patient named "+patient.getPatientName()+" has been added.");
	}
	@RequestMapping("patientRecords")
	public ModelAndView patientRecords() {
		List<Patient>p=hs.getPatientDetails();
		return new ModelAndView("PatientDetails.jsp","list",p);
	}
}
