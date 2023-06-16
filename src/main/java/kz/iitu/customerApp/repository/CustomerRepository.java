package kz.iitu.customerApp.repository;

import kz.iitu.customerApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} Class.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
