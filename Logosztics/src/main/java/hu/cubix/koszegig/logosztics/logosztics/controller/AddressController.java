package hu.cubix.koszegig.logosztics.logosztics.controller;

import hu.cubix.koszegig.logosztics.logosztics.dto.AddressDto;
import hu.cubix.koszegig.logosztics.logosztics.mapper.AddressMapper;
import hu.cubix.koszegig.logosztics.logosztics.model.Address;
import hu.cubix.koszegig.logosztics.logosztics.repository.AddressRepository;
import hu.cubix.koszegig.logosztics.logosztics.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AddressRepository addressRepository;
    @PostMapping
    public AddressDto create(@RequestBody AddressDto addressDto) {
        return addressMapper.addressToDto(addressService.save(
                addressMapper.dtoToAddress(addressDto)));
    }
    @PutMapping("/{id}")
    public AddressDto update(@PathVariable long id, @RequestBody AddressDto addressDto) {
        addressDto.setId(id);
        Address updatedAddress = addressService.update(addressMapper.dtoToAddress(addressDto));
        if (updatedAddress == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return addressMapper.addressToDto(updatedAddress);
    }
}
