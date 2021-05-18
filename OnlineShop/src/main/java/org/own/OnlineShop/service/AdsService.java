package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdsService {
    private static final Logger logger = LogManager.getLogger(AdsService.class);

    @Autowired
    private AdsRepository adsRepository;
}
