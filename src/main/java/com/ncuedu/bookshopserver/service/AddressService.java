package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Address;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/17 13:21
 **/
public interface AddressService {

    Integer addAddress(Address address);

    List<Address> getAddressByUserId(Integer userId);

    Integer setAddressFlag(Address address);

    Integer updateAddress(Address address);

    Integer deleteAddress(Integer id);
}
