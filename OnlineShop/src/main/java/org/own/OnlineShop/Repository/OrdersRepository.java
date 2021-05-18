package org.own.OnlineShop.Repository;

import org.own.OnlineShop.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
}
