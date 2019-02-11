package webstoreexample;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {

		Product product = (Product) target;

		if (product.getId() <= 0) {

			errors.rejectValue("id", "required.id");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"required.name");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description",
				"required.description");

		if (product.getPrice() <= 0) {
			errors.rejectValue("price", "required.price");
		}

		if (product.getUnitsInStock() <= 0) {
			errors.rejectValue("unitsInStock", "required.unitsInStock");
		}

	}

}
