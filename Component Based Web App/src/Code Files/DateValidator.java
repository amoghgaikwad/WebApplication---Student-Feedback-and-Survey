package homework3;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("dateValidate")
public class DateValidator implements Validator {

	    @Override
	    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	        if (value == null) {
	            return;
	        }

	        UIInput startDateComponent = (UIInput) component.getAttributes().get("startDateComponent");

	        if (!startDateComponent.isValid()) {
	            return; 
	        }

	        Date startDate = (Date) startDateComponent.getValue();

	        if (startDate == null) {
	            return;
	        }

	        Date endDate = (Date) value;

	        if (startDate.after(endDate)) {
	            startDateComponent.setValid(false);
	            throw new ValidatorException(new FacesMessage(
	                FacesMessage.SEVERITY_ERROR, "Semester Start date should be greater than the Survey Date", null));
	        }
	    }

}
