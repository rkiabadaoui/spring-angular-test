package main.java.lu.atozdigital.api.service;

import lu.atozdigital.api.model.Ordre;
import lu.atozdigital.api.model.Article;
import lu.atozdigital.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Ordre> getOrders() {

        return orderRepository.findAll();
    }

    public Ordre saveOrder(Ordre order) {
        Ordre savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}