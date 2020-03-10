package com.ncuedu.bookshopserver.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNull() {
            addCriterion("address_province is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNotNull() {
            addCriterion("address_province is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceEqualTo(String value) {
            addCriterion("address_province =", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotEqualTo(String value) {
            addCriterion("address_province <>", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThan(String value) {
            addCriterion("address_province >", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("address_province >=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThan(String value) {
            addCriterion("address_province <", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("address_province <=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLike(String value) {
            addCriterion("address_province like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotLike(String value) {
            addCriterion("address_province not like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIn(List<String> values) {
            addCriterion("address_province in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotIn(List<String> values) {
            addCriterion("address_province not in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceBetween(String value1, String value2) {
            addCriterion("address_province between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("address_province not between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("address_city is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("address_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("address_city =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("address_city <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("address_city >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("address_city >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("address_city <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("address_city <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("address_city like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("address_city not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("address_city in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("address_city not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("address_city between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("address_city not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCountyIsNull() {
            addCriterion("address_county is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountyIsNotNull() {
            addCriterion("address_county is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountyEqualTo(String value) {
            addCriterion("address_county =", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyNotEqualTo(String value) {
            addCriterion("address_county <>", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyGreaterThan(String value) {
            addCriterion("address_county >", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyGreaterThanOrEqualTo(String value) {
            addCriterion("address_county >=", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyLessThan(String value) {
            addCriterion("address_county <", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyLessThanOrEqualTo(String value) {
            addCriterion("address_county <=", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyLike(String value) {
            addCriterion("address_county like", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyNotLike(String value) {
            addCriterion("address_county not like", value, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyIn(List<String> values) {
            addCriterion("address_county in", values, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyNotIn(List<String> values) {
            addCriterion("address_county not in", values, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyBetween(String value1, String value2) {
            addCriterion("address_county between", value1, value2, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressCountyNotBetween(String value1, String value2) {
            addCriterion("address_county not between", value1, value2, "addressCounty");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNull() {
            addCriterion("address_street is null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNotNull() {
            addCriterion("address_street is not null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetEqualTo(String value) {
            addCriterion("address_street =", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotEqualTo(String value) {
            addCriterion("address_street <>", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThan(String value) {
            addCriterion("address_street >", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThanOrEqualTo(String value) {
            addCriterion("address_street >=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThan(String value) {
            addCriterion("address_street <", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThanOrEqualTo(String value) {
            addCriterion("address_street <=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLike(String value) {
            addCriterion("address_street like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotLike(String value) {
            addCriterion("address_street not like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIn(List<String> values) {
            addCriterion("address_street in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotIn(List<String> values) {
            addCriterion("address_street not in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetBetween(String value1, String value2) {
            addCriterion("address_street between", value1, value2, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotBetween(String value1, String value2) {
            addCriterion("address_street not between", value1, value2, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedIsNull() {
            addCriterion("address_detailed is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedIsNotNull() {
            addCriterion("address_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedEqualTo(String value) {
            addCriterion("address_detailed =", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedNotEqualTo(String value) {
            addCriterion("address_detailed <>", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedGreaterThan(String value) {
            addCriterion("address_detailed >", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("address_detailed >=", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedLessThan(String value) {
            addCriterion("address_detailed <", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedLessThanOrEqualTo(String value) {
            addCriterion("address_detailed <=", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedLike(String value) {
            addCriterion("address_detailed like", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedNotLike(String value) {
            addCriterion("address_detailed not like", value, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedIn(List<String> values) {
            addCriterion("address_detailed in", values, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedNotIn(List<String> values) {
            addCriterion("address_detailed not in", values, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedBetween(String value1, String value2) {
            addCriterion("address_detailed between", value1, value2, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressDetailedNotBetween(String value1, String value2) {
            addCriterion("address_detailed not between", value1, value2, "addressDetailed");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIsNull() {
            addCriterion("address_code is null");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIsNotNull() {
            addCriterion("address_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCodeEqualTo(String value) {
            addCriterion("address_code =", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotEqualTo(String value) {
            addCriterion("address_code <>", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeGreaterThan(String value) {
            addCriterion("address_code >", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("address_code >=", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeLessThan(String value) {
            addCriterion("address_code <", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeLessThanOrEqualTo(String value) {
            addCriterion("address_code <=", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeLike(String value) {
            addCriterion("address_code like", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotLike(String value) {
            addCriterion("address_code not like", value, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeIn(List<String> values) {
            addCriterion("address_code in", values, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotIn(List<String> values) {
            addCriterion("address_code not in", values, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeBetween(String value1, String value2) {
            addCriterion("address_code between", value1, value2, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressCodeNotBetween(String value1, String value2) {
            addCriterion("address_code not between", value1, value2, "addressCode");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("address_name =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("address_name >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("address_name <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("address_name like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("address_name not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("address_name in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressTelIsNull() {
            addCriterion("address_tel is null");
            return (Criteria) this;
        }

        public Criteria andAddressTelIsNotNull() {
            addCriterion("address_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTelEqualTo(String value) {
            addCriterion("address_tel =", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelNotEqualTo(String value) {
            addCriterion("address_tel <>", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelGreaterThan(String value) {
            addCriterion("address_tel >", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelGreaterThanOrEqualTo(String value) {
            addCriterion("address_tel >=", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelLessThan(String value) {
            addCriterion("address_tel <", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelLessThanOrEqualTo(String value) {
            addCriterion("address_tel <=", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelLike(String value) {
            addCriterion("address_tel like", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelNotLike(String value) {
            addCriterion("address_tel not like", value, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelIn(List<String> values) {
            addCriterion("address_tel in", values, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelNotIn(List<String> values) {
            addCriterion("address_tel not in", values, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelBetween(String value1, String value2) {
            addCriterion("address_tel between", value1, value2, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressTelNotBetween(String value1, String value2) {
            addCriterion("address_tel not between", value1, value2, "addressTel");
            return (Criteria) this;
        }

        public Criteria andAddressFlagIsNull() {
            addCriterion("address_flag is null");
            return (Criteria) this;
        }

        public Criteria andAddressFlagIsNotNull() {
            addCriterion("address_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAddressFlagEqualTo(Integer value) {
            addCriterion("address_flag =", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagNotEqualTo(Integer value) {
            addCriterion("address_flag <>", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagGreaterThan(Integer value) {
            addCriterion("address_flag >", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_flag >=", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagLessThan(Integer value) {
            addCriterion("address_flag <", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagLessThanOrEqualTo(Integer value) {
            addCriterion("address_flag <=", value, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagIn(List<Integer> values) {
            addCriterion("address_flag in", values, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagNotIn(List<Integer> values) {
            addCriterion("address_flag not in", values, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagBetween(Integer value1, Integer value2) {
            addCriterion("address_flag between", value1, value2, "addressFlag");
            return (Criteria) this;
        }

        public Criteria andAddressFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("address_flag not between", value1, value2, "addressFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}