package com.hx78.spring.jdbc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class JavaCollection {
    private List addressList;
    private Set addressSet;
    private Map addressMap;
    private Properties addressProp;

    public List getAddressList() {
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
