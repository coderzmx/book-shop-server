package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.AddressMapper;
import com.ncuedu.bookshopserver.pojo.Address;
import com.ncuedu.bookshopserver.pojo.AddressExample;
import com.ncuedu.bookshopserver.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/17 13:22
 **/
@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;
    @Override
    public Integer addAddress(Address address) {
        if(address.getAddressFlag()==1){
            Address record = new Address();
            record.setAddressFlag(0);
            AddressExample addressExample = new AddressExample();
            addressExample.or().andUserIdEqualTo(address.getUserId());
            addressMapper.updateByExampleSelective(record,addressExample);
        }
        return addressMapper.insertSelective(address);
    }

    @Override
    public List<Address> getAddressByUserId(Integer userId) {
        AddressExample addressExample = new AddressExample();
        addressExample.or().andUserIdEqualTo(userId);
        List<Address> addresses = addressMapper.selectByExample(addressExample);
        return addresses;
    }

    @Override
    public Integer setAddressFlag(Address address) {
        AddressExample addressExample = new AddressExample();
        addressExample.or().andUserIdEqualTo(address.getUserId());
        Address record = new Address();
        record.setAddressFlag(0);
        addressMapper.updateByExampleSelective(record,addressExample);
        return addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public Integer updateAddress(Address address) {
        return addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public Integer deleteAddress(Integer id) {
        return addressMapper.deleteByPrimaryKey(id);
    }
}
