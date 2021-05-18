package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    private static final Logger logger = LogManager.getLogger(RatingService.class);

    @Autowired
    private RatingRepository ratingRepository;
}
