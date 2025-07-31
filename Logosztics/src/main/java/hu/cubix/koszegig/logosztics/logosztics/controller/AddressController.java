package hu.cubix.koszegig.logosztics.logosztics.controller;

import hu.cubix.koszegig.logosztics.logosztics.mapper.AddressMapper;
import hu.cubix.koszegig.logosztics.logosztics.repository.AddressRepository;
import hu.cubix.koszegig.logosztics.logosztics.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AddressRepository addressRepository;
}
