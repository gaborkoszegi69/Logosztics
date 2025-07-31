package hu.cubix.koszegig.logosztics.logosztics.service;

import hu.cubix.koszegig.logosztics.logosztics.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

}
