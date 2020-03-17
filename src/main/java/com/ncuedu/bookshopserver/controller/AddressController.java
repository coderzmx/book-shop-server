package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Address;
import com.ncuedu.bookshopserver.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/17 13:23
 **/
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public Integer addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("/addresses")
    public List<Address> getAddressesByUserId(Integer userId){
        return addressService.getAddressByUserId(userId);
    }

    @PostMapping("/address/flag")
    public Integer setAddressFlag(@RequestBody Address address){
        return addressService.setAddressFlag(address);
    }

    @PutMapping("/address")
    public Integer updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    @DeleteMapping("/address/{id}")
    public Integer deleteAddress(@PathVariable("id") Integer id){
        return addressService.deleteAddress(id);
    }
}
