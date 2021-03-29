package com.ibm.searchorder;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderSearchRepository extends MongoRepository<Order, String> {

}
