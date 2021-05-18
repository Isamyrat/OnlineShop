package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.BasketDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketDeviceService {
    private static final Logger logger = LogManager.getLogger(BasketDeviceService.class);

    @Autowired
    private BasketDeviceRepository basketDeviceRepository;
}
