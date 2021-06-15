package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.BrandRepository;
import org.own.OnlineShop.model.Brand;
import org.own.OnlineShop.model.TypeOfDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Service
public class BrandService {
    private static final Logger logger = LogManager.getLogger(BrandService.class);

    @Autowired
    private BrandRepository brandRepository;

    public void saveBrandOfProduct(MultipartFile file, String name){
        logger.info("Call method: saveTypeOfProduct");
        Brand brand  = new Brand();
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        if(fileName.contains("..")){
            System.out.println("not a valid file");
        }
        try{
            brand.setImg(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        brand.setName(name);
        brandRepository.save(brand);
    }
}
