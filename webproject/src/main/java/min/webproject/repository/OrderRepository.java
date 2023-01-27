package min.webproject.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import min.webproject.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }
}