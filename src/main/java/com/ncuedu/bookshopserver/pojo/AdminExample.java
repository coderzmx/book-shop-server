package com.ncuedu.bookshopserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNull() {
            addCriterion("admin_tel is null");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNotNull() {
            addCriterion("admin_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTelEqualTo(String value) {
            addCriterion("admin_tel =", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotEqualTo(String value) {
            addCriterion("admin_tel <>", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThan(String value) {
            addCriterion("admin_tel >", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThanOrEqualTo(String value) {
            addCriterion("admin_tel >=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThan(String value) {
            addCriterion("admin_tel <", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThanOrEqualTo(String value) {
            addCriterion("admin_tel <=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLike(String value) {
            addCriterion("admin_tel like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotLike(String value) {
            addCriterion("admin_tel not like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelIn(List<String> values) {
            addCriterion("admin_tel in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotIn(List<String> values) {
            addCriterion("admin_tel not in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelBetween(String value1, String value2) {
            addCriterion("admin_tel between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotBetween(String value1, String value2) {
            addCriterion("admin_tel not between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperIsNull() {
            addCriterion("admin_is_super is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperIsNotNull() {
            addCriterion("admin_is_super is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperEqualTo(Integer value) {
            addCriterion("admin_is_super =", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperNotEqualTo(Integer value) {
            addCriterion("admin_is_super <>", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperGreaterThan(Integer value) {
            addCriterion("admin_is_super >", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_is_super >=", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperLessThan(Integer value) {
            addCriterion("admin_is_super <", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperLessThanOrEqualTo(Integer value) {
            addCriterion("admin_is_super <=", value, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperIn(List<Integer> values) {
            addCriterion("admin_is_super in", values, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperNotIn(List<Integer> values) {
            addCriterion("admin_is_super not in", values, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperBetween(Integer value1, Integer value2) {
            addCriterion("admin_is_super between", value1, value2, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminIsSuperNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_is_super not between", value1, value2, "adminIsSuper");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNull() {
            addCriterion("admin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNotNull() {
            addCriterion("admin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeEqualTo(Date value) {
            addCriterion("admin_create_time =", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotEqualTo(Date value) {
            addCriterion("admin_create_time <>", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThan(Date value) {
            addCriterion("admin_create_time >", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_create_time >=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThan(Date value) {
            addCriterion("admin_create_time <", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_create_time <=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIn(List<Date> values) {
            addCriterion("admin_create_time in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotIn(List<Date> values) {
            addCriterion("admin_create_time not in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_create_time between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_create_time not between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIsNull() {
            addCriterion("admin_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIsNotNull() {
            addCriterion("admin_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeEqualTo(Date value) {
            addCriterion("admin_update_time =", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotEqualTo(Date value) {
            addCriterion("admin_update_time <>", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeGreaterThan(Date value) {
            addCriterion("admin_update_time >", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_update_time >=", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeLessThan(Date value) {
            addCriterion("admin_update_time <", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_update_time <=", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIn(List<Date> values) {
            addCriterion("admin_update_time in", values, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotIn(List<Date> values) {
            addCriterion("admin_update_time not in", values, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_update_time between", value1, value2, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_update_time not between", value1, value2, "adminUpdateTime");
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