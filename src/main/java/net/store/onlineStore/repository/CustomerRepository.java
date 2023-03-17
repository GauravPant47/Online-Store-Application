package net.store.onlineStore.repository;

import org.springframework.data.repository.CrudRepository;

import net.store.onlineStore.model.CustomerModel;

public interface CustomerRepository extends CrudRepository<CustomerModel, Long>{
	CustomerModel fineByCustomerID(int custmerId);
}
