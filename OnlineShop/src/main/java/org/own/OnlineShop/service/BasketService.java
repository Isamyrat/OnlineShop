package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
    private static final Logger logger = LogManager.getLogger(BasketService.class);

    @Autowired
    private BasketRepository basketRepository;
}
