package net.store.onlineStore.repository;

import org.springframework.data.repository.CrudRepository;

import net.store.onlineStore.model.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel, Long>{
	ProductModel findByProductId(int productId);
}
