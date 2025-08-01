package hu.cubix.koszegig.logosztics.logosztics.repository;

import hu.cubix.koszegig.logosztics.logosztics.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressRepository extends JpaRepository <Address, Long> {
}
