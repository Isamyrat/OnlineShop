package org.own.OnlineShop.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.Repository.TypeOfDeviceRepository;
import org.own.OnlineShop.model.TypeOfDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
public class TypeOfDeviceService {
    private static final Logger logger = LogManager.getLogger(TypeOfDeviceService.class);

    @Autowired
    private TypeOfDeviceRepository typeOfDeviceRepository;

    public void saveTypeOfProduct(MultipartFile file, String name){
        logger.info("Call method: saveTypeOfProduct");
        TypeOfDevice typeOfDevice  = new TypeOfDevice();
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        if(fileName.contains("..")){
            System.out.println("not a valid file");
        }
        try{
            typeOfDevice.setImg(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        typeOfDevice.setName(name);
        typeOfDeviceRepository.save(typeOfDevice);
    }
    public Optional<TypeOfDevice> getType(Short id) {
        return typeOfDeviceRepository.findById(id);
    }

    public List<TypeOfDevice> getAllTypes(){
        return typeOfDeviceRepository.findAll();
    }
}
