package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.TypeOfDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfDeviceService {
    private static final Logger logger = LogManager.getLogger(TypeOfDeviceService.class);

    @Autowired
    private TypeOfDeviceRepository typeOfDeviceRepository;
}
