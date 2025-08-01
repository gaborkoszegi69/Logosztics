package hu.cubix.koszegig.logosztics.logosztics.service;

import hu.cubix.koszegig.logosztics.logosztics.model.Address;
import hu.cubix.koszegig.logosztics.logosztics.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public Address save(Address address) {
        return addressRepository.save(address);
    }
    @Transactional
    public Address update(Address address) {
        if(!addressRepository.existsById(address.getaddressId()))
            return null;
        return addressRepository.save(address);
    }
    public List<Address> findAll() {
        return  addressRepository.findAll();
    }
    @Transactional
    public void delete(long id) {
        addressRepository.deleteById(id);
    }

}
