package com.buffer.productservice.command.api.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffer.productservice.command.api.commands.CreateProductCommand;
import com.buffer.productservice.command.api.model.ProductRestModel;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    private CommandGateway commandGateway;

    public ProductCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String addProduct(@RequestBody ProductRestModel productRestModel) {

        CreateProductCommand createProductCommand =
                new CreateProductCommand.CreateProductCommandBuilder()
                        .setProductId(UUID.randomUUID().toString())
                        .setName(productRestModel.getName())
                        .setPrice(productRestModel.getPrice())
                        .setQuantity(productRestModel.getQuantity())
                        .build();
        String result = commandGateway.sendAndWait(createProductCommand);
        return result;
    }
}