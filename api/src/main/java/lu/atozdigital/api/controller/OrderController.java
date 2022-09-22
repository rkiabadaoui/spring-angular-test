package main.java.lu.atozdigital.api.controller;

import lu.atozdigital.api.model.Ordre;
import lu.atozdigital.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public Iterable<Ordre> getOrders() {

        return orderService.getOrders();
    }

    @PostMapping("/order_1")
    public Ordre saveOrder(@RequestBody Ordre order)
    {
        return orderService.saveOrder(order);
    }
}
