package pl.ryniu.petclinic.services.map;

import java.util.Set;

import pl.ryniu.petclinic.model.Owner;
import pl.ryniu.petclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		super.save(object.getId(), object);
		return object;
	}

	@Override
	public Owner findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
	}
	
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }


}
