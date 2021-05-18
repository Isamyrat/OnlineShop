package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.DeviceInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceInformationService {
    private static final Logger logger = LogManager.getLogger(DeviceInformationService.class);

    @Autowired
    private DeviceInformationRepository deviceInformationRepository;
}

