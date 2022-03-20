package mn.ezbuy.customerservice.repository;

import mn.ezbuy.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Optional<Customer> findUserByEmail(String email);

	Optional<Customer> findByUserName(String username);
}
