package lk.ijse_13.Spring_Boot.repo;

import lk.ijse_13.Spring_Boot.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {
}
