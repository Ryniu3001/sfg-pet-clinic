package pl.ryniu.petclinic.services;

import pl.ryniu.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
