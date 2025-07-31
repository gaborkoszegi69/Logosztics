package hu.cubix.koszegig.logosztics.logosztics.mapper;

import hu.cubix.koszegig.logosztics.logosztics.dto.AddressDto;
import hu.cubix.koszegig.logosztics.logosztics.model.Address;
import jakarta.persistence.Column;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    List<AddressDto> addressesToDtos(List<Address> addresses);

    @Mapping(source="addressId", target = "id")
    @Mapping(source="addressISOFCode", target = "ISOFCode")
    @Mapping(source="addressZIP", target = "ZIP")
    @Mapping(source="addressCity", target = "city")
    @Mapping(source="addressStreet", target = "street")
    @Mapping(source="addressLatitude", target = "latitude")
    @Mapping(source="addressLongtude", target = "longtude")
    AddressDto addressToDto(Address address);

    @InheritInverseConfiguration
    Address dtoToAddress(AddressDto addressDto);
    List<Address> dtosToAddresses(List<AddressDto> addressDtoes);
}
